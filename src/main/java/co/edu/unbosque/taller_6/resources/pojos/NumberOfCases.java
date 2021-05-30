package co.edu.unbosque.taller_6.resources.pojos;

import java.util.List;

public class NumberOfCases {
    private  Integer casesT;
    private List<ListCasesType> CasesType;

    public NumberOfCases() {

    }
    public NumberOfCases(Integer casesT, List<ListCasesType> casesType) {
        this.casesT = casesT;
        CasesType = casesType;
    }

    public Integer getCasesT() {
        return casesT;
    }

    public void setCasesT(Integer casesT) {
        this.casesT = casesT;
    }

    public List<ListCasesType> getCasesType() {
        return CasesType;
    }

    public void setCasesType(List<ListCasesType> casesType) {
        CasesType = casesType;
    }
}
