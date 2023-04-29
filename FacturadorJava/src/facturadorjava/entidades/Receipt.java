/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturadorjava.entidades;

import java.util.Date;

/**
 *
 * @author EUGE
 */
public class Receipt {
    private int salesPoint;
    private int typeOfReceipt;
    private Date dateReceipt;
    private int concept;
    private String condicionFiscalPurchaser;
    private long cuitPurchaser;
    private String namePurchaser;
    private int conditionSale;

    public Receipt() {
    }

    public Receipt(int salesPoint, int typeOfReceipt, Date dateReceipt, int concept, String condicionFiscalPurchaser, long cuitPurchaser, String namePurchaser, int conditionSale) {
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

    public int getTypeOfReceipt() {
        return typeOfReceipt;
    }

    public void setTypeOfReceipt(int typeOfReceipt) {
        this.typeOfReceipt = typeOfReceipt;
    }

    public Date getDateReceipt() {
        return dateReceipt;
    }

    public void setDateReceipt(Date dateReceipt) {
        this.dateReceipt = dateReceipt;
    }

    public int getConcept() {
        return concept;
    }

    public void setConcept(int concept) {
        this.concept = concept;
    }

    public String getCondicionFiscalPurchaser() {
        return condicionFiscalPurchaser;
    }

    public void setCondicionFiscalPurchaser(String condicionFiscalPurchaser) {
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

    public int getConditionSale() {
        return conditionSale;
    }

    public void setConditionSale(int conditionSale) {
        this.conditionSale = conditionSale;
    }

    @Override
    public String toString() {
        return "\n Comprobante{" + "Punto de venta=" + salesPoint + ", Tipo de comprobante=" + typeOfReceipt + ", Fecha de emisión=" + dateReceipt.getDate()+"/"+ + (dateReceipt.getMonth()+1) +"/" + (dateReceipt.getYear()+1900) +", Concepto=" + concept + ", Condición Fiscal Comprador=" + condicionFiscalPurchaser + ", CUIT Comprador=" + cuitPurchaser + ", Nombre Comprador=" + namePurchaser + ", Condición de venta=" + conditionSale + '}';
    }

}
