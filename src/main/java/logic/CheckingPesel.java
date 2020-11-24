package logic;

public class CheckingPesel {

static public boolean itscorectPesel(String id){
    int[] controlNumbers ={1,3,7,9,1,3,7,9,1,3};
    char[] peselTab=id.toCharArray();
    int  sumPoint = 0;

    if(id.length() != 11) {
     return false;
    }

    for(int i =0 ;i<controlNumbers.length;i++){
        sumPoint+= controlNumbers[i]*Character.getNumericValue(peselTab[i]);
    }
    return sumPoint%Character.getNumericValue(peselTab[10])==0;
    }
}
