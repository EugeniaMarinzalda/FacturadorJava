
package facturadorjava.Service;

import Enumeradores.Concept;
import Enumeradores.ConditionFiscal;
import Enumeradores.Condition_Sale;
import Enumeradores.TypeOfReceipt;
import facturadorjava.entidades.Receipt;
import facturadorjava.entidades.User;
import java.util.Date;
import java.util.Scanner;

public class ServiceReceipt {
    
    private static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Receipt createReceipt(){ 
        System.out.println("Ingrese el punto de venta");
        int salesPoint=scan.nextInt();
        
        System.out.println("Ingrese el Tipo de comprobante \n 1-Factura \n 2-Nota de Credito \n 3-Nota de Debito \n 4-Recibo");
        int opc=scan.nextInt();
        if (opc<1 || opc>4) {
            opc = 1;
        }
        TypeOfReceipt tipos[] = TypeOfReceipt.values();
        TypeOfReceipt typeOfReceipt = tipos[opc-1];
        
        Date dateReceipt= new Date();
        
        System.out.println("Conceptos a Incluir \n 1-Producto \n 2-Servicio \n 3-Producto y Servicio");
        opc=scan.nextInt();
        if (opc<1 || opc>3) {
            opc=3;
        }
        Concept[] concepts = Concept.values();
        Concept concept = concepts[opc-1];
        
        System.out.println("Datos del comprador:");
        
        System.out.println("Ingrese la condicion fiscal: \n1-Consumidor Final\n2-Monotributista\n3-Responsable Inscripto\n4-Exento\n5-Monotributo Promovido\n6-Monotributo Social\n7-Sujeto no Categorizado\n8-Cliente del Exterior ");
        opc=scan.nextInt();
        if (opc<1 || opc >8) {
            opc = 1;
        }
        ConditionFiscal[] condition =  ConditionFiscal.values();
        ConditionFiscal condicionFiscalPurchaser = condition[opc-1];
        
        System.out.println("Ingrese el CUIT");
        long cuitPurchaser=scan.nextLong();
        
        System.out.println("Ingrese denominación social");
        String namePurchaser=scan.next();
        
        System.out.println("Ingrese la condicion de venta \n1-Contado\n2-Tarjeta de Credito\n3-Tarjeta de Debito\n4-Cuenta Corriente\n5-Cheque\n6-Ticket\n7-Otra");
        opc = scan.nextInt();
        if (opc<1 || opc >7) {
            opc =7;
        }
        Condition_Sale[] conditions = Condition_Sale.values();
        Condition_Sale conditionSale = conditions[opc-1];
 
        return new Receipt ( salesPoint,  typeOfReceipt,  dateReceipt,  concept,  condicionFiscalPurchaser,  cuitPurchaser,  namePurchaser,  conditionSale); 
    }
    
    public void createReceiptList(Receipt f, User u){ 
        u.getReceipts().add(f);
    }
      
}
