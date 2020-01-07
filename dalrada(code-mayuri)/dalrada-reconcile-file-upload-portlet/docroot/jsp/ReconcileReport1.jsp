<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<script
	src="<%= renderRequest.getContextPath()%>/js/jquery-1.11.1.min.js"></script>
<script
	src="<%=renderRequest.getContextPath()%>/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet"
	href="<%=renderRequest.getContextPath()%>/css/jquery.dataTables.css">

<portlet:resourceURL var="serveResource">
	<portlet:param name="cmd" value="flatDataSource" />
</portlet:resourceURL>

<%-- <portlet:resourceURL var="downloadURL">
	<portlet:param name="cmd" value="FileReconcileReportExcle" />
</portlet:resourceURL> --%>


<%-- <portlet:actionURL var="downloadURL" name="reconcileSendMail"></portlet:actionURL> --%>

<portlet:resourceURL var="downloadMorethanOneURL">
	<portlet:param name="cmd" value="flatDataSourceMorethanOne" />
</portlet:resourceURL>


<portlet:resourceURL var="downloadDocumentURL">
	<portlet:param name="cmd" value="downloadDocument" />
</portlet:resourceURL>

<style>
.message-container {
	padding: 10px;
	margin: 2px;
	display: none;
	background: rgba(128, 128, 128, 0.33);
	border: 1px solid #0A0A0C;
}

.portlet-title {
	visibility: hidden;
}

table#userTable thead tr,table#userSecoundTable thead tr{
display: none !important;
}

.aui .dataTable th {
    margin: 0px;
    padding: 4px;
}
.aui .dataTable td {
    width: 130px;
    text-align: center;
    /* padding: 8px 18px !important; */
}
.aui .dataTable td:nth-child(6),.aui .dataTable td:nth-child(9) {
    width: 300px;
}
table.dataTable td.dataTables_empty{

text-align:left !important;

}
</style>


					<h2><center><b>Reconcile Report</b></center></h2>
								
					<br>
					<aui:button type="button" style="width: 300px;"
						class="btn btn-md btn-primary" onClick="<%= downloadDocumentURL %>"
						value="Download Reconcile Report" />
					<br>
					<br>

					<table id="userTable" class="display" cellspacing="0" width="100%">
						<thead>
							<tr style="background: #0088cc; color: white;">
								<th>Order Date</th>
								<th>PoNumber</th>
								<th>Channel Name</th>
								<th>Order Status</th>
								<th>sku</th>
								<th>Product Name</th>
								<th>Quantity</th>
								
								<th>Order Total</th>
								<th>Supplier Cost Per Sku</th>
								<th>Sales Price</th>
								<th>Amazon Amount</th>
								<th>Ext Net Unit</th>
								<th>Profit</th>
								<th>ROI</th>
							</tr>
						</thead>

					</table>
					
					<!-- <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br> -->
					<table id="userSecoundTable" class="display" cellspacing="0" width="100%">
						<thead>
							<tr style="background: #0088cc; color: white;">
								<th>Order Date</th>
								<th>PoNumber</th>
								<th>Channel Name</th>
								<th>Order Status</th>
								<th>sku</th>
								<th>Product Name</th>
								<th>Quantity</th>
								
								<th>Order Total</th>
								<th>Supplier Cost Per Sku</th>
								<th>Sales Price</th>
								<th>Amazon Amount</th>
								<th>ExtNetUnit</th>
								<th>Profit</th>
								<th>ROI</th>
							</tr>
						</thead>

					</table>
					
<script>
 $(document).ready(function() {
	 
     $('#userTable').dataTable( {
    	 "scrollX": true,
    	 "columnDefs": [
 	              { width: '130', targets: [0,1,2,3,4,6,7,9,10,11,12,13] },
 	              { width: '300', targets: [5,8] },
 	          ],
         "ajax": {
           "url":"<%=serveResource%>",
           "dataSrc": ""
          },
         "columns": [
             { "data": "orderDate" },
             { "data": "poNumber" },
             { "data": "channelName" },
             { "data": "orderStatus" },
             { "data": "sku" },
             { "data": "productName" },
             { "data": "quantity" },
             { "data": "orderTotal" },
             { "data": "supplierCostPerSku" },
             { "data": "salesPrice" },
             { "data": "amazonAmount" },
             { "data": "extNetUnit" },
             { "data": "profit" },
             { "data": "roi" }
         ]
     } );
     
     
 } );
 </script>
 
 <script>
 $(document).ready(function() {
                $('#userSecoundTable').dataTable( {
                	"scrollX": true,
                	"columnDefs": [
          	 	              { width: '130', targets: [0,1,2,3,4,6,7,9,10,11,12,13] },
          	 	              { width: '300', targets: [5,8] },
          	 	    ],
                    "ajax": {
                      "url":"<%=downloadMorethanOneURL%>",
                      "dataSrc": ""
                     },
                    "columns": [
                        { "data": "orderDate" },
                        { "data": "poNumber" },
                        { "data": "channelName" },
                        { "data": "orderStatus" },
                        { "data": "sku" },
                        { "data": "productName" },
                        { "data": "quantity" },
                        { "data": "orderTotal" },
                        { "data": "supplierCostPerSku" },
                        { "data": "salesPrice" },
                        { "data": "amazonAmount" },
                        { "data": "extNetUnit" },
                        { "data": "profit" },
                        { "data": "roi" }
                    ]
                } );
            } );
 </script>