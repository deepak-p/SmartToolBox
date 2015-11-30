<%-- 
    Document   : test.jsp
    Created on : Nov 29, 2015, 3:16:37 PM
    Author     : deepak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="renderer" content="webkit">
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta name="generator" content="9466 Design Engine 2.0.3" />
        <title>Inventory</title>
        <link rel="stylesheet" href="assets/inventory.css?1448472039" />
        <script type="text/javascript" src="assets/inventory.js?1448472039"></script>
        <!--[if IE 6]>
        <script> try { document.execCommand('BackgroundImageCache', false, true); } catch(e) {} </script>
        <![endif]-->
    </head>
    <body id="w-body-aaaa" data-type="body" class="p-164042 n-widget w-body">
        <div id="w-columnbox-aaab" data-type="columnbox" class="n-widget w-columnbox">
            <div class="w-col" style="width:29.759519038076%;">
                <div id="w-area-aaac" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-text-aaad" data-type="text" class="n-widget w-text">
                        Smart Toolbox Admin
                    </div>
                </div>
            </div>
            <div class="w-col" style="width:14.028056112224%;">
                <div id="w-area-aaae" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-button-aaaf" data-type="button" class="n-widget w-button t-button-am08 t-button-am08-black">
                        <a href="./index.php?nfssp=home" class="w-button-container w-button-fixed" id="w-button-aaaf-b">
                            <span class="w-button-text"><i class="middle"></i><b class="text">Home</b></span><i class="w-button-right"></i>
                        </a>
                    </div>
                </div>
            </div>
            <div class="w-col" style="width:14.094856379426%;">
                <div id="w-area-aaag" data-type="area" class="p-164042 n-widget w-area">
                </div>
            </div>
            <div class="w-col" style="width:14.061456245825%;">
                <div id="w-area-aaah" data-type="area" class="p-164042 n-widget w-area">
                </div>
            </div>
            <div class="w-col" style="width:14.028056112224%;">
                <div id="w-area-aaai" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-button-aaaj" data-type="button" class="n-widget w-button t-button-am08 t-button-am08-black">
                        <a href="./index.php?nfssp=home"  class="w-button-container w-button-fixed" id="w-button-aaaj-b">
                            <span class="w-button-text"><i class="middle"></i><b class="text">Back</b></span><i class="w-button-right"></i>
                        </a>
                    </div>
                </div>
            </div>
            <div class="w-col" style="width:14.028056112224%;">
                <div id="w-area-aaak" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-button-aaal" data-type="button" class="n-widget w-button t-button-am08 t-button-am08-black">
                        <a href="./index.php?nfssp=index" class="w-button-container w-button-fixed" id="w-button-aaal-b">
                            <span class="w-button-text"><i class="middle"></i><b class="text">Log out</b></span><i class="w-button-right"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
        
        
        
        <%
           
                out.println(request.getAttribute("Message"));
            

        %>
        <div id="w-text-aaam" data-type="text" class="n-widget w-text">
            Inventory Report
        </div>
        <div id="w-area-aaan" data-type="area" class="p-164042 n-widget w-area">
            <div id="w-area-aaao" data-type="area" class="p-164042 n-widget w-area">
                <div id="w-text-aaap" data-type="text" class="n-widget w-text">
                    <b>Show all items</b>
                </div>
                <div id="w-button-aaaq" data-type="button" class="n-widget w-button t-button-am08 t-button-am08-black">
                    <a href="./index.php?nfssp=allitems" class="w-button-container w-button-fixed" id="w-button-aaaq-b">
                        <span class="w-button-text"><i class="middle"></i><b class="text">Go</b></span><i class="w-button-right"></i>
                    </a>
                </div>
            </div>
        </div>
        <div id="w-area-aaar" data-type="area" class="p-164042 n-widget w-area">
            <div id="w-area-aaas" data-type="area" class="p-164042 n-widget w-area">
                <div id="w-100002-text-aaat" data-type="100002.text" class="n-widget w-100002-text">
                    <div class="form-group" data-comid="comid45f4a864988ec54e" data-title="Show items that have been checked out at least（times）" data-required="0">
                        <label>Show items that have been checked out at least（times） <span class="required"></span></label>
                        <input type="text" class="form-control input" value="" style="width: 13%">
                    </div>
                </div>
                <div id="w-area-aaau" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-100002-text-aaav" data-type="100002.text" class="n-widget w-100002-text">
                        <div class="form-group" data-comid="comid8c703d08757edfdb" data-title="Begin date" data-required="0">
                            <label>Begin date <span class="required"></span></label>
                            <input type="text" class="form-control input" value="" style="width: 13%">
                        </div>
                    </div>
                </div>
                <div id="w-area-aaaw" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-100002-text-aaax" data-type="100002.text" class="n-widget w-100002-text">
                        <div class="form-group" data-comid="comid8c703d08757edfdb" data-title="End date" data-required="0">
                            <label>End date <span class="required"></span></label>
                            <input type="text" class="form-control input" value="" style="width: 13%">
                        </div>
                    </div>
                </div>
                <div id="w-button-aaay" data-type="button" class="n-widget w-button t-button-am08 t-button-am08-black">
                    <a href="./index.php?nfssp=allitems" class="w-button-container w-button-fixed" id="w-button-aaay-b">
                        <span class="w-button-text"><i class="middle"></i><b class="text">Go</b></span><i class="w-button-right"></i>
                    </a>
                </div>
            </div>
            <div id="w-area-aaaz" data-type="area" class="p-164042 n-widget w-area">
                <div id="w-100002-text-aaba" data-type="100002.text" class="n-widget w-100002-text">
                    <div class="form-group" data-comid="comid1645948e4eda98b4" data-title="Show items that have been checked out at most(times)" data-required="0">
                        <label>Show items that have been checked out at most(times) <span class="required"></span></label>
                        <input type="text" class="form-control input" value="" style="width: 13%">
                    </div>
                </div>
                <div id="w-area-aabb" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-100002-text-aabc" data-type="100002.text" class="n-widget w-100002-text">
                        <div class="form-group" data-comid="comide93c3c528d67814e" data-title="Begin date" data-required="0">
                            <label>Begin date <span class="required"></span></label>
                            <input type="text" class="form-control input" value="" style="width: 13%">
                        </div>
                    </div>
                </div>
                <div id="w-area-aabd" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-100002-text-aabe" data-type="100002.text" class="n-widget w-100002-text">
                        <div class="form-group" data-comid="comid46da2b9b71f5b593" data-title="End date" data-required="0">
                            <label>End date <span class="required"></span></label>
                            <input type="text" class="form-control input" value="" style="width: 13%">
                        </div>
                    </div>
                </div>
                <div id="w-button-aabf" data-type="button" class="n-widget w-button t-button-am08 t-button-am08-black">
                    <a href="./index.php?nfssp=allitems" class="w-button-container w-button-fixed" id="w-button-aabf-b">
                        <span class="w-button-text"><i class="middle"></i><b class="text">Go</b></span><i class="w-button-right"></i>
                    </a>
                </div>
            </div>
            <div id="w-area-aabg" data-type="area" class="p-164042 n-widget w-area">
                <div id="w-100002-select-aabh" data-type="100002.select" class="n-widget w-100002-select">
                    <div class="form-group" data-comid="comid5419d7964f215a69" data-title="show only" data-required="1">
                        <label>show only <span class="required">*</span></label>
                        <select class="form-control select" name="select_comid5419d7964f215a69">
                            <option data-id="1" data-title="Available" value="Available"> Available</option>
                            <option data-id="2" data-title="Missing" value="Missing"> Missing</option>
                            <option data-id="3" data-title="Lost" value="Lost"> Lost</option>
                            <option data-id="4" data-title="Broken" value="Broken"> Broken</option>
                        </select>
                    </div>
                </div>
                <div id="w-text-aabi" data-type="text" class="n-widget w-text">
                    items
                </div>
                <div id="w-button-aabj" data-type="button" class="n-widget w-button t-button-am08 t-button-am08-black">
                    <a href="./index.php?nfssp=allitems" class="w-button-container w-button-fixed" id="w-button-aabj-b">
                        <span class="w-button-text"><i class="middle"></i><b class="text">Go</b></span><i class="w-button-right"></i>
                    </a>
                </div>
            </div>
        </div>
        <!--custom footer start-->
        <script type="text/javascript">var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
            document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fce299e0fd4094e4d5efce40bab839811' type='text/javascript'%3E%3C/script%3E"));</script>
        <!--custom footer end-->
    </body>
</html>