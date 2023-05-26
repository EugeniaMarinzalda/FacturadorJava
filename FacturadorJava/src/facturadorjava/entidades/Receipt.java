
package facturadorjava.entidades;

import Enumeradores.Concept;
import Enumeradores.ConditionFiscal;
import Enumeradores.Condition_Sale;
import Enumeradores.TypeOfReceipt;
import java.util.Date;

public class Receipt {
    private int salesPoint;
    private TypeOfReceipt typeOfReceipt;
    private Date dateReceipt;
    private Concept concept;
    private ConditionFiscal condicionFiscalPurchaser;
    private long cuitPurchaser;
    private String namePurchaser;
    private Condition_Sale conditionSale;

    public Receipt() {
    }

    public Receipt(int salesPoint, TypeOfReceipt typeOfReceipt, Date dateReceipt, Concept concept, ConditionFiscal condicionFiscalPurchaser, long cuitPurchaser, String namePurchaser, Condition_Sale conditionSale) {
        this.salesPoint = salesPoint;
        this.typeOfReceipt = typeOfReceipt;
        this.dateReceipt = dateReceipt;
        this.concept = concept;
        this.condicionFiscalPurchaser = condicionFiscalPurchaser;
        this.cuitPurchaser = cuitPurchaser;
        this.namePurchaser = namePurchaser;
        this.conditionSale = conditionSale;
    }

    public int getSalesPoint() {
        return salesPoint;
    }

    public void setSalesPoint(int salesPoint) {
        this.salesPoint = salesPoint;
    }

    public TypeOfReceipt getTypeOfReceipt() {
        return typeOfReceipt;
    }

    public void setTypeOfReceipt(TypeOfReceipt typeOfReceipt) {
        this.typeOfReceipt = typeOfReceipt;
    }

    public Date getDateReceipt() {
        return dateReceipt;
    }

    public void setDateReceipt(Date dateReceipt) {
        this.dateReceipt = dateReceipt;
    }

    public Concept getConcept() {
        return concept;
    }

    public void setConcept(Concept concept) {
        this.concept = concept;
    }

    public ConditionFiscal getCondicionFiscalPurchaser() {
        return condicionFiscalPurchaser;
    }

    public void setCondicionFiscalPurchaser(ConditionFiscal condicionFiscalPurchaser) {
        this.condicionFiscalPurchaser = condicionFiscalPurchaser;
    }

    public long getCuitPurchaser() {
        return cuitPurchaser;
    }

    public void setCuitPurchaser(long cuitPurchaser) {
        this.cuitPurchaser = cuitPurchaser;
    }

    public String getNamePurchaser() {
        return namePurchaser;
    }

    public void setNamePurchaser(String namePurchaser) {
        this.namePurchaser = namePurchaser;
    }

    public Condition_Sale getConditionSale() {
        return conditionSale;
    }

    public void setConditionSale(Condition_Sale conditionSale) {
        this.conditionSale = conditionSale;
    }

    

    @Override
    public String toString() {
        
        return "Comprobante{" + "Punto de venta=" + salesPoint + ", Tipo de comprobante=" + typeOfReceipt + ", Fecha de emisión=" + dateReceipt.getDate()+"/"+ + (dateReceipt.getMonth()+1) +"/" + (dateReceipt.getYear()+1900) +", Concepto=" + concept + ", Condición Fiscal Comprador=" + condicionFiscalPurchaser + ", CUIT Comprador=" + cuitPurchaser + ", Nombre Comprador=" + namePurchaser + ", Condición de venta=" + conditionSale+"\n";
    }

}
