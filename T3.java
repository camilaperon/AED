public class T3 {

    //1. Mostrar inteiros com caracter separador
    public static void mostrarInteiros(int[] v, char sep) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]); //vai mostrar v na posicao i
            if (i < v.length - 1) { //pro final ficar sem anda
                System.out.print(sep);
            }
        }
        System.out.println();
    }

    //2. Filtrar maiores 
    public static int[] filtrarMaiores(int[] v, int x) {
        int count = 0; 
        for (int i = 0; i < v.length; i++) {
            if (v[i] > x) {
                count++;
            }
        }

        int[] resultado = new int[count];//determina o tamanho do vetor final
        int index = 0; // pposicao no vetor
        for (int i = 0; i < v.length; i++) {
            if (v[i] > x) {
                resultado[index++] = v[i];
            }
        }

        return resultado;
    }

    //3. Filtrar menores mesma coisa que a de cima
    public static int[] filtrarMenores(int[] v, int x) {
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < x) {
                count++;
            }
        }

        int[] resultado = new int[count];
        int index = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < x) {
                resultado[index++] = v[i];
            }
        }

        return resultado;
    }

    //4.Aplicar E lógico
    public static boolean[] aplicarELogico(boolean[] va, boolean[] vb) {
        int length = va.length; 
        if (vb.length < va.length) {
            length = vb.length;
        }
        boolean[] resultado = new boolean[length];
        for (int i = 0; i < length; i++) {
            resultado[i] = va[i] && vb[i];
        }
        return resultado;
    }
    

    //5. Aplicar OU lógico
    public static boolean[] aplicarOuLogico(boolean[] va, boolean[] vb) {
        int length = va.length;
        if (vb.length < va.length) {
            length = vb.length;
        }
        boolean[] resultado = new boolean[length];
        for (int i = 0; i < length; i++) {
            resultado[i] = va[i] || vb[i];
        }
        return resultado;
    }
    

    //6. Aplicar máscara, mostra só os true os de vdd eu sei quem sao
    public static int[] aplicarMascara(int[] v, boolean[] mascara) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (mascara[i]) { // SAQUI ELE VEQUANRAS POSICOES TERÁ NO VETOR
                cont++;
            }
        }

        int[] resultado = new int[cont];
        int novPos = 0;
        for (int i = 0; i < v.length; i++) {
            if (mascara[i]) { // AAQUI ELE VERIFICA SE A MASCARA NA POSICAO I É VDD E AI ADICIONA
                resultado[novPos++] = v[i];
            }
        }

        return resultado;
    }

    //7. União 
    public static int[] uniao(int[] va, int[] vb) {
        int[] vc = new int[va.length + vb.length];
        int cont = 0;
        
        for (int i = 0; i < va.length; i++) {
            vc[cont++] = va[i];
        }

        for (int i = 0; i < vb.length; i++) {
            vc[cont++] = vb[i];
        }

        return vc;
    }

    //8. Interseção vetores
    public static int[] intersecao(int[] va, int[] vb) {
        int[] vc = new int[va.length]; 
        int cont = 0;
    
        for (int i = 0; i < va.length; i++) {
            for (int j = 0; j < vb.length; j++) {
                if (va[i] == vb[j]) {
                    vc[cont] = va[i];
                    cont++;
                }
            }
        }
    
        int[] resultado = new int[cont];
        for (int i = 0; i < cont; i++) {
            resultado[i] = vc[i];
        }
    
        return resultado;
    }
    

    //9. Diferença vetores
    public static int[] diferenca(int[] va, int[] vb) {
        int[] vc = new int[va.length]; 
        int cont = 0;
    
        for (int i = 0; i < va.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < vb.length; j++) {
                if (va[i] == vb[j]) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                vc[cont] = va[i];
                cont++;
            }
        }
        int[] resultado = new int[cont];
        for (int i = 0; i < cont; i++) {
            resultado[i] = vc[i];
        }
    
        return resultado;
    }
    


    // 11. Matriz transposta n enetendi nd
    public static int[][] matrizTranspor(int[][] m) {
        int linhas = m.length;
        int colunas = m[0].length;
        int[][] resultado = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[j][i] = m[i][j];
            }
        }

        return resultado;
    }

    //12. Permutação de linhas
    public static int[][] matrizPermutacaoLinhas(int[][] m, int linha1, int linha2) {
        int[] x = m[linha1];
        m[linha1] = m[linha2];
        m[linha2] = x;
        return m;
    }
}
