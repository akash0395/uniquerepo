package sportclub.test;

import sportclub.model.ItemInfo;
import sportclub.model.SupplierInfo;
import sportclub.service.SupplierService;

public class TestSuppelier {

	public static void main(String[] args) {
		/*ItemInfo it=new ItemInfo(1,"kit",2,500);
		SupplierInfo s=new SupplierInfo(1,"rg","sdgdf","pune",it,5000);
		System.out.println(s);*/
		
		SupplierInfo[] supp=new SupplierInfo[2];
		SupplierService.acceptSupplier(supp);
		SupplierService.displaySupplier(supp);
		
	}
}
