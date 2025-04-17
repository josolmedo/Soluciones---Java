public class Solucion {
    public static int EncuentraElNumeroMasCercanoACero(int[] nums) {
        int valorActual;
        int minimo = nums[0];
        for(int i = 0; i<nums.length; i++){
            valorActual = nums[i];           
            if(FuncionesUtiles.valorAbsoluto(valorActual) < FuncionesUtiles.valorAbsoluto(minimo)) {//CASO 1
                minimo = valorActual;
            }
            else if(FuncionesUtiles.valorAbsoluto(valorActual) == FuncionesUtiles.valorAbsoluto(minimo)){ //CASO 2
                minimo = FuncionesUtiles.maximoEntreDosNumeros(valorActual, minimo);
            }
            else{
                continue;
            }            
        }
        return minimo;        
    }
    
}

/*For(numero: nums){
    minimo = FuncionesUtiles.valorAbsoluto(minimo);
    valorActual = FuncionesUtiles.valorAbsoluto(valorActual);
    if(valorActual < minimo){
        minimo = valorActual
    }
    else if(valorActua)






*/