
package facturadorjava.Service;

import facturadorjava.entidades.Receipt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ServiceReceipt {
    
    private static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public ArrayList <Receipt> receiptList = new ArrayList <>();
    
    public Receipt createReceipt(){ // en proceso
        System.out.println("Ingrese el punto de venta");
        int salesPoint=scan.nextInt();
        System.out.println("Ingrese el Tipo de comprobante \n 1-Factura \n 2-Nota de Credito \n 3-Nota de Debito \n 4-Recibo \n 5-Salir");
        int typeOfReceipt=scan.nextInt();
        Date dateReceipt= new Date();
        System.out.println("Conceptos a Incluir \n 1-Producto \n 2-Servicio \n 3-Producto y Servicio \n 4-Salir");
        int concept=scan.nextInt();
        System.out.println("Datos del comprador:");
        System.out.println("Ingrese la condicion fiscal");
        String condicionFiscalPurchaser=scan.next();
        System.out.println("Ingrese el CUIT");
        long cuitPurchaser=scan.nextLong();
        System.out.println("Ingrese el Nombre y Apellido");
        String namePurchaser=scan.next();
        System.out.println("Ingrese la condicion de venta \n 1-Contado \n 2-Tarjeta credito/debito \n 3-Otro \n 4-Salir");
        int conditionSale=scan.nextInt();
        return new Receipt (salesPoint,typeOfReceipt,dateReceipt,concept,condicionFiscalPurchaser,cuitPurchaser,namePurchaser,conditionSale); 
 
    }
    
    public Receipt createReceiptFab (int salesPoint, int typeOfReceipt, Date dateReceipt, int concept, String condicionFiscalPurchaser, long cuitPurchaser, String namePurchaser, int conditionSale) {
        int salesPoint1 = salesPoint;
        int typeOfReceipt1 = typeOfReceipt;
        Date dateReceipt1 = dateReceipt;
        int concept1 = concept;
        String condicionFiscalPurchaser1 = condicionFiscalPurchaser;
        long cuitPurchaser1 = cuitPurchaser;
        String namePurchaser1 = namePurchaser;
        int conditionSale1 = conditionSale;
        return new Receipt(salesPoint1, typeOfReceipt1, dateReceipt1, concept1, condicionFiscalPurchaser1, cuitPurchaser1, namePurchaser1, conditionSale1);
    }
    
    public void createReceiptList(Receipt f){ 
        receiptList.add(f);
    }
    public void createList(Receipt f){ 
        receiptList.add(f);
    }
    public void showList(){
        System.out.println(receiptList);
    } 
}
