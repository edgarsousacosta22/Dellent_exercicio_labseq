package org.acme;

import io.quarkus.cache.CacheResult;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/labseq")
public class labseqdellent {

    private static final String SEQUENCE_CACHE = "sequence-cache";

    @GET
    @Path("/{n}")
    @Produces(MediaType.TEXT_PLAIN)
    public String obterValor(@PathParam("n") int n) {
        if (n < 0) {
            return "O valor de 'n' não pode ser negativo. Por favor, altere o valor.";
        }
        long start = System.currentTimeMillis();
        int resultado = calcularSeq(n);
        long end = System.currentTimeMillis();
        long tempo = end - start;

        if (tempo < 10000) {
            return String.valueOf(resultado);
        } else {
            return "O cálculo de l(10000) demorou mais de 10 segundos.";
        }
    }

    @CacheResult(cacheName = SEQUENCE_CACHE)
    public int calcularSeq(int n) {
        return calcularSeqC(n, new int[n + 1]);
    }
    // Função auxiliar usando cache
    private int calcularSeqC(int n, int[] cache) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 0;
        } else if (n == 3) {
            return 1;
        }

        if (cache[n] != 0) {
            return cache[n];
        }
        // Calcula o valor usando resultados em cache
        int resultado = calcularSeqC(n - 4, cache) + calcularSeqC(n - 3, cache);
        cache[n] = resultado;
        return resultado;
    }
}
