<%-- 
    Document   : shoppingCartContent
    Created on : Nov 15, 2016, 3:19:01 AM
    Author     : Tran Minh Quang
--%>

<%@page import="BusinessObject.MySingleton"%>
<%@page import="java.util.List"%>
<%@page import="BusinessObject.MySingleton"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.TreeMap"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="JDBC.DBContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<p></p>
<div class="row">
    <div class="col-sm-12">
        <table class="table table-bordered table-striped dataTable" role="grid" aria-describedby="example1_info" >
            <tr><th bgcolor="grey">Product ID</th>
                <th bgcolor="grey">Name</th>
                <th bgcolor="grey">Price(USD)</th>
                <th bgcolor="grey">Amount</th>
                <th bgcolor="grey">Value(USD)</th>
            </tr>
            <%
                float totalValue = 0;
                DBContext db = new DBContext();
                TreeMap<String, Integer> mapID = MySingleton.getInstance().getMapID();
                Cookie cookie = null;
                List<Cookie> cookies = MySingleton.getInstance().getCookies();
//                cookies = request.getCookies();
                if (cookies != null) {
                    for (int i = 0; i < cookies.size(); i++) {
                        cookie = cookies.remove(i);
                        i--;
                        System.out.println(cookie.getName() + ": " + cookie.getValue() + " i :" + i);
                        if (mapID.containsKey(cookie.getValue())) {
                            mapID.put(cookie.getValue(), mapID.get(cookie.getValue()) + 1);
                        } else {
                            mapID.put(cookie.getValue(), 1);
                        }
                    }
                    
                    System.out.println("cookies size:" + cookies.size());
                    System.out.println("map size:" + mapID.size());
                    for (Map.Entry<String, Integer> entry : mapID.entrySet()) {
                        System.out.println(entry.getKey());
                        String sql = "SELECT * FROM Pro_Details where Product_ID = '" + entry.getKey() + "'";
                        try {
                            ResultSet rs = db.executeQuery(sql);
                            rs.next();
                            totalValue += rs.getFloat(6) * entry.getValue();
            %>
            <tr>
                <td><%=rs.getInt(1)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getFloat(6)%></td>
                <td><%=entry.getValue()%></td>
                <td><%=rs.getFloat(6) * entry.getValue()%></td>
            </tr>
            <%
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            %>
            <tr>
                <td colspan="4" align="right">Total</td>
                <td><%=totalValue%></td>
            </tr>
        </table>
    </div>
</div>
<div class="row">
    <div class="col-md-6">
        <div class="form-horizontal">
            <div class="form-group">
                <div class="col-md-offset-1 col-md-10">
                    <a class="btn btn-github" href="sale.jsp">Home page</a>
                    <a class="btn btn-github" href="newCart.jsp">Checkout</a>
                </div>
            </div>
        </div>
    </div>
</div>
