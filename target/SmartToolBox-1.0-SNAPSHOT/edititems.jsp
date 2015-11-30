<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Entities.Tools"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!doctype html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="renderer" content="webkit">
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta name="generator" content="9466 Design Engine 2.0.3" />
        <title>addnewitem</title>
        <link rel="stylesheet" href="assets/addnewitem.css?1443810310" />
        <script type="text/javascript" src="assets/addnewitem.js?1443810310"></script>
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
                        <a href="./index.php?nfssp=manageitem" class="w-button-container w-button-fixed" id="w-button-aaaj-b">
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
        <div id="w-text-aaam" data-type="text" class="n-widget w-text">
            <font><font class="">Edit the Item</font></font>
        </div>

        <form id="contactForm" class="form-inline" name="login" method="post" action="updatetools">
            

               
                    <div id="w-area-aaas" data-type="area" class="p-164042 n-widget w-area">
                        <div id="w-100002-text-aaat" data-type="100002.text" class="n-widget w-100002-text">
                            <div class="form-group" data-comid="comidf6d0ebe137974811" data-title="Tag ID" data-required="1">
                                <label>Tag ID <span class="required">*</span></label>
                                <input type="text" name="tool_id" class="form-control input" value='<c:out value="${tools.getId()}" />' style="width: 100%">
                            </div>
                        </div>
                    </div>
                </div>
                <div id="w-area-aaau" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-100002-text-aaav" data-type="100002.text" class="n-widget w-100002-text">
                        <div class="form-group" data-comid="comid07e0da8f9b1b7793" data-title="Description" data-required="1">
                            <label>Name the Tool <span class="required">*</span></label>
                            <input type="text" name="tool_name" class="form-control input" value='<c:out value="${tools.getToolName()}" />' style="width: 100%">
                        </div>
                    </div>
                </div>
                <div id="w-area-aaay" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-100002-select-aaaz" data-type="100002.select" class="n-widget w-100002-select">
                        <div class="form-group" data-comid="comidab4f83d0a5ac3c92" data-title="Category" data-required="1">
                            <label>Type <span class="required">*</span></label>
                            <select class="form-control select" name="type">
                                <option data-id="1" data-title="1" value="Screwdrivers"> Screwdrivers</option>
                                <option data-id="2" data-title="2" value="Pliers"> Pliers</option>
                                <option data-id="3" data-title="3" value="Hand Cutters"> Hand Cutters</option>
                                <option data-id="4" data-title="4" value="Hammers">Hammers</option>
                                <option data-id="5" data-title="5" value="Wrenches"> Wrenches</option>
                                <option data-id="6" data-title="6" value="Sockets"> Sockets</option>
                                <option data-id="7" data-title="7" value="Other"> Other</option>

                            </select>
                        </div>
                    </div>
                </div>
                <div id="w-area-aaay" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-100002-select-aaaz" data-type="100002.select" class="n-widget w-100002-select">
                        <div class="form-group" data-comid="comidab4f83d0a5ac3c92" data-title="Category" data-required="1">
                            <label>Drawer Location <span class="required">*</span></label>
                            <select class="form-control select" name="drawer">
                                <option data-id="1" data-title="1" value="1"> 1</option>
                                <option data-id="2" data-title="2" value="2"> 2</option>
                                <option data-id="3" data-title="3" value="3"> 3</option>
                                <option data-id="4" data-title="4" value="4">4</option>
                                <option data-id="5" data-title="5" value=5> 5</option>
                            </select>
                        </div>
                    </div>
                </div>
                
                 <div id="w-area-aaay" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-100002-select-aaaz" data-type="100002.select" class="n-widget w-100002-select">
                        <div class="form-group" data-comid="comidab4f83d0a5ac3c92" data-title="Category" data-required="1">
                            <label>Status <span class="required">*</span></label>
                            <select class="form-control select" name="status" >
                                <option data-id="1" data-title="1" value="available">Available</option>
                                <option data-id="2" data-title="2" value="missing">Missing</option>
                                <option data-id="3" data-title="3" value="lost">Lost</option>
                                <option data-id="4" data-title="4" value="broken">Broken</option>
                              
                            </select>
                        </div>
                    </div>
                </div>
                
              
                <div id="w-area-aaba" data-type="area" class="p-164042 n-widget w-area">
                    <div id="w-columnbox-aabb" data-type="columnbox" class="n-widget w-columnbox">
                        <div class="w-col" style="width:33.333333333333%;">
                            <div id="w-area-aabc" data-type="area" class="p-164042 n-widget w-area">
                                <div id="w-button-aabd" data-type="button" class="n-widget w-button t-button-am08 t-button-am08-black">
                                    <input  id="submit" tabindex="5" name="action" value="update" type="submit"> 

                                </div>
                            </div>
                        </div>

                        <div class="w-col" style="width:33.333333333333%;">
                            <div id="w-area-aabg" data-type="area" class="p-164042 n-widget w-area">
                                <div id="w-button-aabh" data-type="button" class="n-widget w-button t-button-am08 t-button-am08-black">
                                    <input  id="submit" tabindex="5" name="action" value="delete" type="submit"> 

                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </form>
        <!--custom footer start-->
        <script type="text/javascript">var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
            document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fce299e0fd4094e4d5efce40bab839811' type='text/javascript'%3E%3C/script%3E"));</script>
        <!--custom footer end-->
    </body>
</html>