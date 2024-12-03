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
            if (mascara[i]) { // AQUI ELE VE QUANtaS POSICOES TERÁ NO VETOR
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
            boolean jaAdicionado = false; //se o número ainda n foi adicionado, adiciona
            for (int k = 0; k < cont; k++) {
                if (vc[k] == va[i]) {
                    jaAdicionado = true;// se o número ja foi adicionado, ele pula
                    break;
                }
            }
            if (!jaAdicionado) {
                vc[cont++] = va[i]; //se nao tiver sido adicionado, ele faz o cont++ e armazena o valor.
            }
        }
    
        for (int i = 0; i < vb.length; i++) { //aqui faz o mesmo q de cima, só q com o vetor b 
            boolean jaAdicionado = false;
            for (int k = 0; k < cont; k++) {
                if (vc[k] == vb[i]) {
                    jaAdicionado = true;
                    break;
                }
            }
            if (!jaAdicionado) {
                vc[cont++] = vb[i];
            }
        }
    
        int[] resultado = new int[cont]; //aloca um vetor do tamanho do contador
        for (int i = 0; i < cont; i++) {
            resultado[i] = vc[i]; //armazena no vetor
        }
    
        return resultado;
    }

    //8. Interseção vetores
    public static int[] intersecao(int[] va, int[] vb) {
        int[] vc = new int[va.length]; //armazena o valor de va em vc
        int cont = 0;
        int k;
    
        for (int i = 0; i < va.length; i++) {
            for (int j = 0; j < vb.length; j++) {
                if (va[i] == vb[j]) { //se o valor do va na posicao i for igual ao valor de vb na posicao j
                    for(k = 0; k < cont; k++){// entra pro for
                        if (vc[k] == va[i]) { //se o valor que esta em vc na posicao k for igual ao valor de va na posicao i
                            break; //quebra o if e sai do for
                        }
                    }
                    if (k == cont) { //se o valor do k for igual ao contador
                        vc[cont++] = va[i]; //pega o vc com o tamanho do contatodo e armazena o valor q está em va na posicao i 
                    }
                    break; //quebra o if
                    
                }
            }
        }
    
        int[] resultado = new int[cont];// aloca um vetor com o tamanho do contador
        for (int i = 0; i < cont; i++) {
            resultado[i] = vc[i]; //coloca os valores no vetor
        }
    
        return resultado;
    }
// 9. Diferença vetores
public static int[] diferenca(int[] va, int[] vb) {
    int[] vc = new int[va.length]; //vc vai receber va
    int cont = 0;

    for (int i = 0; i < va.length; i++) {
        boolean encontrado = false; 
        for (int j = 0; j < vb.length; j++) {
            if (va[i] == vb[j]) {
                encontrado = true;
                break;
            }
        }
        if (!encontrado) { //se for diferente do encontrado
            boolean jaAdicionado = false; //ele é tido como n existe
            for (int k = 0; k < cont; k++) {
                if (vc[k] == va[i]) { //se vc na posicao k for igual a va na posicao i
                    jaAdicionado = true; //e se ja foi adicionado
                    break;//quebra o if
                }
            }
            if (!jaAdicionado) { //se ianda n foi adiicionado, adiciona
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
/*public static int[][] trianguloDePascal(int m) {
    int[][] resultado = new int[m][m];
    
    for (int i = 0; i < m; i++) {
        resultado[i][0] = 1; // oq ta erradp mds
        for (int j = 1; j <= i; j++) {
            //resultado[i] //ele vai retornar o numero 1 [j]//numero q ta em j ; 
        }
    }
    
    return resultado;
}*/
    // 11. Matriz transposta n enetendi nd
    public static int[][] matrizTranspor(int[][] m) {
        int linhas = m.length;
        int colunas = m[0].length;//pq so da certo assim?
        int[][] resultado = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[j][i] = m[i][j];//aqui inverte as linhas com as colunas
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
