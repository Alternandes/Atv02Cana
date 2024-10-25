// Função para ordenação Selection Sort
public class SelectionSort {  
    public static void selectionSort(int[] arr){  
        // Percorre valores do array
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                // Procurando pelo menor valor
                if (arr[j] < arr[index]){  
                    index = j;   
                }  
            } 
            // Define index do menor numero 
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
    
    // Metodo inicial
    public static void main(String a[]){
        // Define vetor inicial  
        int[] vetor = {3,6,8,1,4,9,0};  

        // Printa em console vetor antes da ordenação
        System.out.println("Antes da ordenação Selection Sort:");  
        for(int i:vetor){  
            System.out.print(i+" ");  
        }
        System.out.println();  
        
        // Organizando array usando selection sort
        selectionSort(vetor);  
         
        // Printa em console vetor pós ordenação
        System.out.println("Depois da ordenação Selection Sort:");  
        for(int i:vetor){  
            System.out.print(i+" ");  
        }  
    }  
}  