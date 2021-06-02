package co.edu.unbosque.taller_6.resources.pojos;

import java.util.List;

/**
 * Class NumberOfCases
 */
public class NumberOfCases {
    private Integer casesT;
    private List<ListCasesType> CasesType;

    /**
     * Constructor
     */
    public NumberOfCases() {

    }

    /**
     * @param casesT
     * @param casesType
     */
    public NumberOfCases(Integer casesT, List<ListCasesType> casesType) {
        this.casesT = casesT;
        CasesType = casesType;
    }

    /**
     * @return
     */
    public Integer getCasesT() {
        return casesT;
    }

    /**
     * @param casesT
     */
    public void setCasesT(Integer casesT) {
        this.casesT = casesT;
    }

    /**
     * @return
     */

    public List<ListCasesType> getCasesType() {
        return CasesType;
    }

    /**
     * @param casesType
     */
    public void setCasesType(List<ListCasesType> casesType) {
        CasesType = casesType;
    }
}
