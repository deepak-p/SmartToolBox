<!doctype html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="renderer" content="webkit">
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta name="generator" content="9466 Design Engine 2.0.3" />
        <title>SmartToolBox</title>
        <!--custom header start--><script>if (!(location.search + '').match(/\bmobile=0\b/) && /Android|webOS|iPhone|Windows Phone|iPod|BlackBerry|SymbianOS/i.test(navigator.userAgent)) {
                location.href = location.href.substring(0, location.href.lastIndexOf('/')) + '/mobile/'
            }</script><!--custom header end-->
        <link rel="stylesheet" href="assets/index.css?1443810305" />
        <script type="text/javascript" src="assets/index.js?1443810305"></script>
        <!--[if IE 6]>
        <script> try { document.execCommand('BackgroundImageCache', false, true); } catch(e) {} </script>
        <![endif]-->
    </head>
    <body id="w-body-aaaa" data-type="body" class="p-164042 n-widget w-body">
        <div id="w-image-aaab" data-type="image" class="n-widget w-image">
            <img src="assets/2a4d69a989125d9d2217588b24829b25.png" />
        </div>
        <div id="w-text-aaac" data-type="text" class="n-widget w-text">
            Welcome
        </div>
        <%

            if (request.getParameter("Message") != null) {
                out.print(request.getParameter("Message"));
            }
        %>
        <form id="contactForm" class="form-inline" method="post" action="login">

            <div id="w-100002-text-aaad" data-type="100002.text" class="n-widget w-100002-text">
                <div class="form-group" data-comid="comid429d2df9fc03b432" data-title="User Account" data-required="1">
                    <label>User Account <span class="required">*</span></label>
                    <input type="text" class="form-control input" name="user" value="" style="width: 23%">
                </div>
            </div>
            <div id="w-100002-text-aaae" data-type="100002.text" class="n-widget w-100002-text">
                <div class="form-group" data-comid="comidfe22b1953a8e8834" data-title="Password" data-required="1">
                    <label>Password <span class="required">*</span></label>
                    <input type="password" class="form-control input" name="pass" value="" style="width: 23%">
                </div>
            </div>




            <input type="submit" class="w-button-right" value="Save" style="width: 23%" ><i class="w-button-right"></i>

            <form>


                <div id="w-button-aaag" data-type="button" class="n-widget w-button t-button-al08">
                    <a href="AccountSignUp.jsp" class="w-button-container w-button-fixed" id="w-button-aaag-b">
                        <span class="w-button-text"><i class="middle"></i><b class="text">Create New Account</b></span><i class="w-button-right"></i>
                    </a>
                </div>
                <!--custom footer start-->
                <script type="text/javascript">var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
            document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fce299e0fd4094e4d5efce40bab839811' type='text/javascript'%3E%3C/script%3E"));</script>
                <!--custom footer end-->
                </body>
                </html>