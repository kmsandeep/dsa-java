package org.sandeep.dsa.linkedList.singlyLinkedList;

/**
 * Hello world!
 *
 */
public class App 
{

    static boolean isPrime(int n){
        boolean result=true;
        if(n <= 1) return false;
        for(int i = 2; i <= n/2; i++){ if(n % i == 0){
                result = false;
                break;
            }
        }
        return result;
    }

    static int diffMaxPrime(int[] arr){
        int maxPrime = 0;
        int minPrime = 0;
        int countPrime=0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                countPrime++;

                if(maxPrime ==0 && minPrime==0){
                    maxPrime = minPrime = arr[i];
                }
                else if(arr[i]>maxPrime){
                    maxPrime=arr[i];
                }
                else if(arr[i]<minPrime){
                    minPrime=arr[i];
                }
            }
        }
        if(countPrime<2){
            return 0;
        }
        else{
            System.out.println("max "+maxPrime);
            System.out.println("min "+minPrime);

            return maxPrime > minPrime ? maxPrime - minPrime : minPrime - maxPrime;
        }
    }




    public static void main( String[] args )
    {

int []arr = new int[]{1,5,7,8,22,67};
      //  diffMaxPrime(arr);


        System.out.println( diffMaxPrime(arr) );
    }







}
