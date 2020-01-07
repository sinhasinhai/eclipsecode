package com.dalrada.dashboard.file.upload;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.prakat.dashboard.application.model.OrderRegistration;
import com.prakat.dashboard.application.service.OrderRegistrationLocalServiceUtil;

public class FileStoringServiceController {
	
	public static String orderCsvFileData(String Date,String StoreOrderId, String orderNumber, String poNumber, String refNumber, String channelName, String orderStatus,
								   String sku, String productName, String quantity, String supplierCostPerSku, String salePrice, String supplierCostTotal,
								   String orderTotal, String suplierName, String storeShippingMethos, String shippingCarrier, String shippingMethod,
								   String trackingNumber, String customerName, String customerEmail, String customerPhone, String addressLine1,
								   String addressLine2, String city, String state, String zip, String country, String Company ,Date toDate, 
								   Date fromDate, long userId){
		try {
			
			String satus = "Success";
			

	        DynamicQuery dynamicQueryStartDate = DynamicQueryFactoryUtil.forClass(OrderRegistration.class, PortletClassLoaderUtil.getClassLoader());
				 
			Criterion criterionStartDate = null;
			criterionStartDate = RestrictionsFactoryUtil.eq("poNumber", poNumber);
			dynamicQueryStartDate.add(criterionStartDate);
			
			List<OrderRegistration> orderRegistrationDetails = OrderRegistrationLocalServiceUtil.dynamicQuery(dynamicQueryStartDate);
			System.out.println("orderRegistrationDetails ::::::::: "+orderRegistrationDetails);
			
			int orderData = 0;
			if(orderRegistrationDetails.size() > 0){
				orderData = 1;
			}
			
			if(orderData == 1){
				for(OrderRegistration registration : orderRegistrationDetails){
					OrderRegistrationLocalServiceUtil.deleteOrderRegistration(registration);
					
					long orderId = 0;
			        OrderRegistration orderRegistration = null;
			        orderId = CounterLocalServiceUtil.increment(OrderRegistration.class.getName());
			        orderRegistration = OrderRegistrationLocalServiceUtil.createOrderRegistration(orderId);
			        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			        Date orderDate;
			         
			        orderDate = (Date) dateFormat.parse(Date);
			        
			        orderRegistration.setOrderDate(orderDate);
			        
			        orderRegistration.setStoreOrderId(StoreOrderId);
			        if(orderNumber.isEmpty() == true){
			        	orderRegistration.setOrderNumber(StoreOrderId);
			        }else{
			        	orderRegistration.setOrderNumber(orderNumber);
			        }
			        
			        if(poNumber.isEmpty() == false){
			        	orderRegistration.setPoNumber(poNumber);
			        }else{
			        	 satus = "Fail";
			        }
			       
			        orderRegistration.setRefNumber(refNumber);
			        
			        if(channelName.isEmpty() == false){
			        	orderRegistration.setChannelName(channelName);
			        }else{
			        	 satus = "Fail";
			        }
			       
			        if(orderStatus.isEmpty() == false){
			        	 orderRegistration.setOrderStatus(orderStatus);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(sku.isEmpty() == false){
			        	 orderRegistration.setSKU(sku);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(productName.isEmpty() == false){
			        	orderRegistration.setProductName(productName);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(quantity.isEmpty() == false){
			        	orderRegistration.setQuantity(Integer.parseInt(quantity));
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(supplierCostPerSku.isEmpty() == false){
			        	orderRegistration.setSupplierCostPerSKU(Double.parseDouble(supplierCostPerSku));
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(salePrice.isEmpty() == false){
			        	orderRegistration.setSalePrice(Double.parseDouble(salePrice));
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(orderTotal.isEmpty() == false){
			        	orderRegistration.setOrderTotal(Double.parseDouble(orderTotal));
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(supplierCostPerSku.isEmpty() == false){
			        	orderRegistration.setSupplierCostPerSKU(Double.parseDouble(supplierCostPerSku));
			        }else{
			        	 satus = "Fail";
			        }
			       
			        if(suplierName.isEmpty() == false){
			        	orderRegistration.setSupplierName(suplierName);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(storeShippingMethos.isEmpty() == false){
			        	orderRegistration.setStoreShippingMethod(storeShippingMethos);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(shippingCarrier.isEmpty() == false){
			        	orderRegistration.setShippingCarrier(shippingCarrier);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(shippingMethod.isEmpty() == false){
			        	orderRegistration.setShippingMethod(shippingMethod);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        orderRegistration.setTrackingNumbers(trackingNumber);
			        
			        if(customerName.isEmpty() == false){
			        	orderRegistration.setCustomerName(customerName);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(customerEmail.isEmpty() == false){
			        	orderRegistration.setCustomerEmail(customerEmail);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        orderRegistration.setCustomerPhone(customerPhone);
			        orderRegistration.setAddressLine1(addressLine1);
			        orderRegistration.setAddressLine2(addressLine2);
			        
			        if(city.isEmpty() == false){
			        	 orderRegistration.setCity(city);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(state.isEmpty() == false){
			        	 orderRegistration.setState(state);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(zip.isEmpty() == false){
			        	orderRegistration.setZip(zip);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        if(country.isEmpty() == false){
			        	 orderRegistration.setCountry(country);
			        }else{
			        	 satus = "Fail";
			        }
			        
			        orderRegistration.setCompany(Company);
			        
			        orderRegistration.setToDate(toDate);
			        orderRegistration.setFromDate(fromDate);
			        orderRegistration.setCreationDate(dateFormat.parse(dateFormat.format( new Date())));
			        orderRegistration.setUserID(userId);
			        
			        if(satus.equals("Success")){
			        	OrderRegistrationLocalServiceUtil.addOrderRegistration(orderRegistration);
			        }
				}
			}
			if(orderData == 0){
				long orderId = 0;
		        OrderRegistration orderRegistration = null;
		        orderId = CounterLocalServiceUtil.increment(OrderRegistration.class.getName());
		        orderRegistration = OrderRegistrationLocalServiceUtil.createOrderRegistration(orderId);
		        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		        Date orderDate;
		         
		        orderDate = (Date) dateFormat.parse(Date);
		        
		        orderRegistration.setOrderDate(orderDate);
		        
		        orderRegistration.setStoreOrderId(StoreOrderId);
		        if(orderNumber.isEmpty() == true){
		        	orderRegistration.setOrderNumber(StoreOrderId);
		        }else{
		        	orderRegistration.setOrderNumber(orderNumber);
		        }
		       
		        if(poNumber.isEmpty() == false){
		        	orderRegistration.setPoNumber(poNumber);
		        }else{
		        	 satus = "Fail";
		        }
		       
		        orderRegistration.setRefNumber(refNumber);
		        
		        if(channelName.isEmpty() == false){
		        	orderRegistration.setChannelName(channelName);
		        }else{
		        	 satus = "Fail";
		        }
		       
		        if(orderStatus.isEmpty() == false){
		        	 orderRegistration.setOrderStatus(orderStatus);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(sku.isEmpty() == false){
		        	 orderRegistration.setSKU(sku);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(productName.isEmpty() == false){
		        	orderRegistration.setProductName(productName);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(quantity.isEmpty() == false){
		        	orderRegistration.setQuantity(Integer.parseInt(quantity));
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(supplierCostPerSku.isEmpty() == false){
		        	orderRegistration.setSupplierCostPerSKU(Double.parseDouble(supplierCostPerSku));
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(salePrice.isEmpty() == false){
		        	orderRegistration.setSalePrice(Double.parseDouble(salePrice));
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(orderTotal.isEmpty() == false){
		        	orderRegistration.setOrderTotal(Double.parseDouble(orderTotal));
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(supplierCostPerSku.isEmpty() == false){
		        	orderRegistration.setSupplierCostPerSKU(Double.parseDouble(supplierCostPerSku));
		        }else{
		        	 satus = "Fail";
		        }
		       
		        if(suplierName.isEmpty() == false){
		        	orderRegistration.setSupplierName(suplierName);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(storeShippingMethos.isEmpty() == false){
		        	orderRegistration.setStoreShippingMethod(storeShippingMethos);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(shippingCarrier.isEmpty() == false){
		        	orderRegistration.setShippingCarrier(shippingCarrier);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(shippingMethod.isEmpty() == false){
		        	orderRegistration.setShippingMethod(shippingMethod);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        orderRegistration.setTrackingNumbers(trackingNumber);
		        
		        if(customerName.isEmpty() == false){
		        	orderRegistration.setCustomerName(customerName);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(customerEmail.isEmpty() == false){
		        	orderRegistration.setCustomerEmail(customerEmail);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        orderRegistration.setCustomerPhone(customerPhone);
		        orderRegistration.setAddressLine1(addressLine1);
		        orderRegistration.setAddressLine2(addressLine2);
		        
		        if(city.isEmpty() == false){
		        	 orderRegistration.setCity(city);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(state.isEmpty() == false){
		        	 orderRegistration.setState(state);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(zip.isEmpty() == false){
		        	orderRegistration.setZip(zip);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        if(country.isEmpty() == false){
		        	 orderRegistration.setCountry(country);
		        }else{
		        	 satus = "Fail";
		        }
		        
		        orderRegistration.setCompany(Company);
		        
		        orderRegistration.setToDate(toDate);
		        orderRegistration.setFromDate(fromDate);
		        orderRegistration.setCreationDate(dateFormat.parse(dateFormat.format( new Date())));
		        orderRegistration.setUserID(userId);
		        
		        if(satus.equals("Success")){
		        	OrderRegistrationLocalServiceUtil.addOrderRegistration(orderRegistration);
		        }
		        
			}
			
			
	        
	        return satus;
		} catch (Exception e) {
			e.printStackTrace();
			return "Fail";
		}
		
	}

}
