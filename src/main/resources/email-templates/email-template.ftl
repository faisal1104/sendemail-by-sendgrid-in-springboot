<!doctype html>
<html>

<head>
    <meta name="viewport" content="width=device-width"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Convenience Pay</title>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500&display=swap" rel="stylesheet">
    <style>
        img {
            border: none;
            -ms-interpolation-mode: bicubic;
            max-width: 100%;
        }

        body {
            font-family: 'Poppins', sans-serif;
            background-color: #f6f6f6;
            -webkit-font-smoothing: antialiased;
            font-size: 14px;
            line-height: 1.4;
            margin: 0;
            padding: 0;
            -ms-text-size-adjust: 100%;
            -webkit-text-size-adjust: 100%;
        }

        table {
            border-collapse: separate;
            mso-table-lspace: 0pt;
            mso-table-rspace: 0pt;
            width: 100%;
        }

        table td {
            font-size: 14px;
            vertical-align: top;
        }

        .bg-primary {
            background: #800080;
        }

        /* -------------------------------------
              BODY & CONTAINER
          ------------------------------------- */

        .body {
            background-color: #f6f6f6;
            width: 100%;
        }

        .container {
            display: block;
            margin: 0 auto !important;
            max-width: 580px;
            padding: 10px;
            width: 580px;
        }

        .content {
            background: #ffffff;
            box-sizing: border-box;
            display: block;
            margin: 0 auto;
            max-width: 580px;
        }

        .header .header-logo {
            background: #800080;
            padding: 20px 15px 15px;
        }

        .title a {
            font-size: 24px;
            line-height: 36px;
            font-weight: 500;
            color: #800080;
            text-decoration: none;
        }

        .subtitle {
            font-size: 18px;
            font-weight: 500;
            color: #002540;
            line-height: 27px;
        }

        .reset-password-url {
            color: #800080;
            display: inline-block;
            /*margin-bottom: 15px;*/
        }

        .social-icon {
            margin: 0 8px;
        }

        .email-content {
            font-size: 16px;
            font-weight: 500;
            color: #222222;
            margin-bottom: 20px;
            line-height: 22px;
        }

        .footer .address {
            padding: 25px 0 0;
            display: block;
            width: 70%;
            margin: auto;
        }

        .address span {
            padding: 0 30px;
            word-break: break-word;
            display: inline-block;
        }

        .main {
            border-radius: 3px;
            width: 100%;
        }

        .wrapper {
            box-sizing: border-box;
            padding: 20px;
        }

        .content-block {
            padding-top: 10px;
            padding-bottom: 10px;
        }

        .footer {
            clear: both;
            text-align: center;
            width: 100%;
            background: #002540;
        }

        .footer td,
        .footer p,
        .footer span,
        .footer a {
            color: #E8EEF2;
            font-size: 12px;
            text-align: center;
            line-height: 18px;
        }

        h1,
        h2,
        h3,
        h4 {
            color: #000000;
            font-weight: 400;
            line-height: 1.4;
            margin: 0;
            margin-bottom: 8px;
        }

        h1 {
            font-size: 35px;
            font-weight: 300;
            text-align: center;
            text-transform: capitalize;
        }

        p,
        ul,
        ol {
            font-size: 14px;
            font-weight: normal;
            margin: 0;
            margin-bottom: 15px;
        }

        p li,
        ul li,
        ol li {
            list-style-position: inside;
            margin-left: 5px;
        }

        a {
            color: #3498db;
            text-decoration: underline;
        }

        .btn {
            box-sizing: border-box;
            width: 100%;
        }

        .btn > tbody > tr > td {
            padding-bottom: 15px;
        }

        .btn table {
            width: auto;
        }

        .btn table td {
            background-color: #ffffff;
            border-radius: 5px;
            text-align: center;
        }

        .btn a {
            background-color: #ffffff;
            border: solid 1px #800080;
            border-radius: 5px;
            box-sizing: border-box;
            color: #3498db;
            cursor: pointer;
            display: inline-block;
            font-size: 14px;
            font-weight: bold;
            margin: 0;
            padding: 12px 25px;
            text-decoration: none;
            text-transform: capitalize;
        }

        .btn-primary table td {
            background-color: #800080;
        }

        .btn-primary a {
            background-color: #800080;
            border-color: #800080;
            color: #ffffff;
        }

        .last {
            margin-bottom: 0;
        }

        .first {
            margin-top: 0;
        }

        .align-center {
            text-align: center;
        }

        .align-right {
            text-align: right;
        }

        .align-left {
            text-align: left;
        }

        .clear {
            clear: both;
        }

        .mt0 {
            margin-top: 0;
        }

        .mb0 {
            margin-bottom: 0;
        }

        .powered-by {
            padding: 15px 0 25px;
        }

        .powered-by a {
            text-decoration: none;
        }

        hr {
            border: 0;
            border-bottom: 1px solid #f6f6f6;
            opacity: 0.7;
        }

        /*RESPONSIVE */
        @media only screen and (max-width: 620px) {
            table[class=body] h1 {
                font-size: 28px !important;
                margin-bottom: 10px !important;
            }

            table[class=body] p,
            table[class=body] ul,
            table[class=body] ol,
            table[class=body] td,
            table[class=body] span,
            table[class=body] a {
                font-size: 16px !important;
            }

            table[class=body] .wrapper,
            table[class=body] .article {
                padding: 10px !important;
            }

            table[class=body] .content {
                padding: 0 !important;
            }

            table[class=body] .container {
                padding: 0 !important;
                width: 100% !important;
            }

            table[class=body] .main {
                border-left-width: 0 !important;
                border-radius: 0 !important;
                border-right-width: 0 !important;
            }

            table[class=body] .btn table {
                width: 100% !important;
            }

            table[class=body] .btn a {
                width: 100% !important;
            }

            table[class=body] .img-responsive {
                height: auto !important;
                max-width: 100% !important;
                width: auto !important;
            }
        }

        @media all {
            .btn-primary table td:hover {
                background-color: #34495e !important;
            }

            .btn-primary a:hover {
                background-color: #34495e !important;
                border-color: #34495e !important;
            }
        }

        .footer-bottom {
            font-size: 10px;
            text-align: center;
            padding: 15px 25px;
            color: rgba(0, 37, 64, 0.7);
            background: #E8EEF2;
        }
    </style>
</head>

<body>
<table role="presentation" border="0" cellpadding="0" cellspacing="0" class="body">
    <tr>
        <td>&nbsp;</td>
        <td class="container">
            <div class="content">
                <div class="header">
                    <table role="presentation" border="0" cellpadding="0" cellspacing="0" class="body">
                        <tr>
                            <td class="header-logo" align="middle">
                                <img src="https://i.ibb.co/Dts8fmt/logo.png">

                            </td>
                        </tr>
                    </table>
                </div>
                <table role="presentation" class="main">

                    <!-- START MAIN CONTENT AREA -->
                    <tr>
                        <td class="wrapper">
                            <table role="presentation" border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td>
                                        <h3 class="title">Dear $email$ + $firstName$,</h3>
                                        ${mailBody}
                                       <#-- <h3 class="title">Hi Jhon,</h3>
                                        <p class="subtitle">We received a request to reset your Convenience Pay
                                            password</p>
                                        <table role="presentation" border="0" cellpadding="0" cellspacing="0"
                                               class="btn btn-primary">
                                            <tbody>
                                            <tr>
                                                <td align="left">
                                                    <table role="presentation" border="0" cellpadding="0"
                                                           cellspacing="0">
                                                        <tbody>
                                                        <tr>
                                                            <td><a href="http://htmlemail.io" target="_blank">Reset
                                                                    Password</a>
                                                            </td>
                                                        </tr>
                                                        </tbody>
                                                    </table>
                                                </td>
                                            </tr>
                                            </tbody>
                                        </table>
                                        <a class="reset-password-url"
                                           href="www.conveniencepay.com/restpassword">www.conveniencepay.com/restpassword</a>
                                        <p class="email-content">Please click the button above within 24 hours of
                                            receiving this email. If
                                            you didn’t request to reset your password, rest assured your account is safe
                                            and you can ignore
                                            this email.</p>-->

                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>

                    <!-- END MAIN CONTENT AREA -->
                </table>
                <div class="footer">
                    <a href=""><img src="https://i.ibb.co/PYByKJF/about-us.png"></a>
                    <table role="presentation" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td class="address-area">
                                <div class="address">
                    <span>© 2020 Convenience Pay. LP42 Building #3, Mangra Trace, San Juan, Trinidad &
                      Tobago
                      <br> Don't like these emails? <a href="#">Unsubscribe</a>.</span>
                                    <hr style="margin-top: 15px;"/>
                                </div>

                            </td>
                        </tr>
                        <tr>
                            <td class="powered-by">
                                <a class="social-icon" href="#">
                                    <img src="https://i.ibb.co/3dnwPRZ/facebook.png" alt="facebook">
                                </a>
                                <a class="social-icon" href="#">
                                    <img src="https://i.ibb.co/qMPNNTQ/instagram.png" alt="instagram">
                                </a>
                                <a class="social-icon" href="#">
                                    <img src="https://i.ibb.co/NjPQY6F/linkedin.png" alt="linkedin">
                                </a>
                            </td>
                        </tr>
                    </table>
                </div>
                <p class="footer-bottom">This message contains confidential information and is intended only for the
                    individual(s) addressed in the message. If you are not the named addressee, you should not
                    disseminate, distribute, or copy this e-mail. If you are not the intended recipient, you are
                    notified that disclosing, distributing, or copying this e-mail is strictly prohibited.
                    </p>
            </div>
        </td>
        <td>&nbsp;</td>
    </tr>
</table>
</body>

</html>