package logic;

public class CheckingPesel {

static public boolean itcorectPesel(String id){
if(id.length() != 11) {
return false;
}
// return id.length() == 11; tak powinno byc poprawnie aczkolwiek wystakiwał mi blond java: unreachable statementint
int[] controlNumbers ={1,3,7,9,1,3,7,9,1,3};
char[] peselTab=id.toCharArray();
int  sumPoint = 0;
for(int i =0 ;i<controlNumbers.length;i++){
    sumPoint+= controlNumbers[i]*Character.getNumericValue(peselTab[i]);
}
return sumPoint%Character.getNumericValue(peselTab[10])==0;
}
}
