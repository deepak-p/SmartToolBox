<%@page import="java.util.List"%>
<%@page import="Entities.ToolsReport"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.maven.smarttoolbox.databasemanagement.DbMgr"%>
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
        <title>AllItems</title>
        <link rel="stylesheet" href="assets/allitems.css?1443810308" />
        <script type="text/javascript" src="assets/allitems.js?1443810308"></script>
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
                        <a href="./index.php?nfssp=inventory" class="w-button-container w-button-fixed" id="w-button-aaaj-b">
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
            <font><font>Inventory results</font></font>
        </div>
        <div id="w-area-aaan" data-type="area" class="p-164042 n-widget w-area">
            <div id="w-area-aaao" data-type="area" class="p-164042 n-widget w-area">
                <div id="w-columnbox-aaap" data-type="columnbox" class="n-widget w-columnbox">
                    <div class="w-col" style="width:16.666666666667%;">
                        <div id="w-area-aaaq" data-type="area" class="p-164042 n-widget w-area">
                            <div id="w-text-aaar" data-type="text" class="n-widget w-text">
                                Image
                            </div>
                        </div>
                    </div>
                    <div class="w-col" style="width:16.666666666667%;">
                        <div id="w-area-aaas" data-type="area" class="p-164042 n-widget w-area">
                            <div id="w-text-aaat" data-type="text" class="n-widget w-text">
                                Description
                            </div>
                        </div>
                    </div>
                    <div class="w-col" style="width:16.666666666667%;">
                        <div id="w-area-aaau" data-type="area" class="p-164042 n-widget w-area">
                            <div id="w-text-aaav" data-type="text" class="n-widget w-text">
                                Category
                            </div>
                        </div>
                    </div>
                    <div class="w-col" style="width:16.666666666667%;">
                        <div id="w-area-aaaw" data-type="area" class="p-164042 n-widget w-area">
                            <div id="w-text-aaax" data-type="text" class="n-widget w-text">
                                <font><font>Tag ID</font></font>
                            </div>
                        </div>
                    </div>
                    <div class="w-col" style="width:14.255319148936%;">
                        <div id="w-area-aaay" data-type="area" class="p-164042 n-widget w-area">
                            <div id="w-text-aaaz" data-type="text" class="n-widget w-text">
                                <font><font>Status</font></font>
                            </div>
                        </div>
                    </div>
                   
                </div>
            </div>
            <c:forEach items="${toolsreport}" var="elements">
                <div id="w-columnbox-aabc" data-type="columnbox" class="n-widget w-columnbox">
                    <div class="w-col" style="width:16.666666666667%;">
                        <div id="w-area-aabd" data-type="area" class="p-164042 n-widget w-area">
                            <div id="w-image-aabe" data-type="image" class="n-widget w-image">
                                <img src="assets/0100c87353fd292e165112f630dd7403.png" />
                            </div>
                        </div>
                    </div>
                    <div class="w-col" style="width:16.666666666667%;">
                        <div id="w-area-aabf" data-type="area" class="p-164042 n-widget w-area">
                            <div id="w-text-aabg" data-type="text" class="n-widget w-text">
                                <font><font class=""><font><font> <c:out value="${elements.getToolName()}" /></font></font></font></font>
                            </div>
                        </div>
                    </div>
                    <div class="w-col" style="width:16.666666666667%;">
                        <div id="w-area-aabh" data-type="area" class="p-164042 n-widget w-area">
                            <div id="w-text-aabi" data-type="text" class="n-widget w-text">
                                <font><font class=""><font><font><c:out value="${elements.getType()}" /></font></font></font></font>
                            </div>
                        </div>
                    </div>
                    <div class="w-col" style="width:16.666666666667%;">
                        <div id="w-area-aabj" data-type="area" class="p-164042 n-widget w-area">
                            <div id="w-text-aabk" data-type="text" class="n-widget w-text">
                                <font><font><c:out value="${elements.getTool_id()}" /></font></font>
                            </div>
                        </div>
                    </div>
                    <div class="w-col" style="width:14.11889596603%;">
                        <div id="w-area-aabl" data-type="area" class="p-164042 n-widget w-area">
                            <div id="w-text-aabm" data-type="text" class="n-widget w-text">
                                <font><font class=""><font><font><c:out value="${elements.getStatus()}" /></font></font></font></font>
                            </div>
                        </div>
                    </div>
               

                    <br><br><br>


                </div>

            </c:forEach>

        </div>
        <!--custom footer start-->
        <script type="text/javascript">var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fce299e0fd4094e4d5efce40bab839811' type='text/javascript'%3E%3C/script%3E"));</script>
        <!--custom footer end-->
    </body>
</html>