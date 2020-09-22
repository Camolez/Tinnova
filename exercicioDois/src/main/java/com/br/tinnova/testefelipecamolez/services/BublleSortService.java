package com.br.tinnova.testefelipecamolez.services;

import org.springframework.stereotype.Service;

@Service
public class BublleSortService {

    public void bubbleSort(int[] arrayOrdenado){
        int lengthArray = arrayOrdenado.length;
        int valorCorrigido ;
        for(int i=0; i < lengthArray; i++){
            for(int j=1; j < (lengthArray-i); j++){
                if(arrayOrdenado[j-1] > arrayOrdenado[j]){
                    valorCorrigido = arrayOrdenado[j-1];
                    arrayOrdenado[j-1] = arrayOrdenado[j];
                    arrayOrdenado[j] = valorCorrigido;
                    printArray(arrayOrdenado);
                }
            }
        }
    }
    private void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    }
