import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Csv {

    private String cvs;
    private String contract;
    private List<String> cvsList;
    private List<String> contractList;

    public Csv(String cvs, String contract) {
        this.cvs = cvs;
        this.contract = contract;
        cvsList = new ArrayList<String>(Arrays.asList(cvs.split(",")));
        contractList = new ArrayList<String>(Arrays.asList(contract.split(",")));
    }

    public void printValueOfIndex(int index){

        System.out.println(contractList.get(index+1) + " = " + cvsList.get(index+1));

    }

    public void printValueOfParameter (String parameter){

        for (int i = 0; i < contractList.size(); i++) {
            if (contractList.get(i).equals(parameter)){
                System.out.println(cvsList.get(i));
                break;
            }
        }
    }


}
