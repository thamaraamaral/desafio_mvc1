/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-10-27 19:56:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/devth/OneDrive/Área%20de%20Trabalho/desafio-mvc/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/projeto-milhas/WEB-INF/lib/spring-webmvc-3.1.0.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1323745962000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.1.0.RELEASE.jar", Long.valueOf(1662809886697L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>GFT Milhas - Cadastro de Usuário</title>\r\n");
      out.write("	<!-- CSS only -->\r\n");
      out.write("	<link\r\n");
      out.write("		href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("		rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("	<style>\r\n");
      out.write("		label.error {\r\n");
      out.write("		color: #d9534f;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		input.error {\r\n");
      out.write("		border: 1px solid #d9534f;\r\n");
      out.write("		}\r\n");
      out.write("	</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-secondary\">\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("		<div class=\"col-md-4 offset-md-4\">\r\n");
      out.write("			<div class=\"card mt-5\">\r\n");
      out.write("				<div class=\"card-body\">\r\n");
      out.write("					<div class=\"text-center\">\r\n");
      out.write("						<h3 class=\"mt-2\">\r\n");
      out.write("							GFT Milhas <br>Criar Conta de Usuário\r\n");
      out.write("						</h3>\r\n");
      out.write("						<p>Preencha os campos para cadastrar sua conta!</p>\r\n");
      out.write("						<hr />\r\n");
      out.write("					</div>\r\n");
      out.write("					<form id=\"formCadastro\" action=\"cadastrar-usuario\" method=\"post\">\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label>Nome do usuário:</label>\r\n");
      out.write("							");
      if (_jspx_meth_form_005finput_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label>Quatro Letras:</label>\r\n");
      out.write("							");
      if (_jspx_meth_form_005finput_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label>Email:</label>\r\n");
      out.write("							");
      if (_jspx_meth_form_005finput_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("							<span class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erro_email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label>Senha de acesso:</label>\r\n");
      out.write("							");
      if (_jspx_meth_form_005finput_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label>Confirme sua senha:</label>\r\n");
      out.write("							");
      if (_jspx_meth_form_005finput_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<div class=\"d-grid\">\r\n");
      out.write("								<input type=\"submit\" value=\"Realizar Cadastro\"\r\n");
      out.write("									class=\"btn btn-primary\" />\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<div class=\"d-grid\">\r\n");
      out.write("								<a href=\"/projeto-milhas/\" class=\"btn btn-light\"> Já possui\r\n");
      out.write("									conta? <strong>Acesse aqui!</strong>\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"text-center\">\r\n");
      out.write("							<strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mensagem}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong>\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- JavaScript Bundle with Popper -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- JS do jquery-->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.1.min.js\"\r\n");
      out.write("		type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- JS do jquery validation -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/jquery-validation@1.19.5/dist/jquery.validate.min.js\"\r\n");
      out.write("		type=\"text/javascript\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/jquery-validation@1.19.5/dist/additional-methods.min.js\"\r\n");
      out.write("		type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- código JS com JQuery -->\r\n");
      out.write("	<script>\r\n");
      out.write("\r\n");
      out.write("		$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("			$(\"#formCadastro\").validate({\r\n");
      out.write("\r\n");
      out.write("				rules : {\r\n");
      out.write("					'nome' : {\r\n");
      out.write("						required : true,\r\n");
      out.write("						minlength : 8\r\n");
      out.write("					},\r\n");
      out.write("\r\n");
      out.write("					'quatroLetras' : {\r\n");
      out.write("						required : true,\r\n");
      out.write("						minlength : 4,\r\n");
      out.write("						maxlength : 4,\r\n");
      out.write("					},\r\n");
      out.write("\r\n");
      out.write("					'email' : {\r\n");
      out.write("						required : true,\r\n");
      out.write("						email : true\r\n");
      out.write("					},\r\n");
      out.write("\r\n");
      out.write("					'senha' : {\r\n");
      out.write("						required : true,\r\n");
      out.write("						minlength : 8,\r\n");
      out.write("						maxlength : 20\r\n");
      out.write("					},\r\n");
      out.write("\r\n");
      out.write("					'senhaConfirmacao' : {\r\n");
      out.write("						required : true,\r\n");
      out.write("						equalTo : '#senha'\r\n");
      out.write("					}\r\n");
      out.write("				},\r\n");
      out.write("\r\n");
      out.write("				messages : {\r\n");
      out.write("					nome : {\r\n");
      out.write("						required : 'Por favor, informe o nome do usuário.',\r\n");
      out.write("						minlength : 'Entre com no mínimo 8 caracteres.'\r\n");
      out.write("					},\r\n");
      out.write("\r\n");
      out.write("					quatroLetras : {\r\n");
      out.write("						required : 'Por favor, suas quatro letras de usuario.',\r\n");
      out.write("						minlength : 'Entre com no mínimo 4 caracteres.',\r\n");
      out.write("						maxlength : 'Entre com no máximo 4 caracteres.'\r\n");
      out.write("					},\r\n");
      out.write("\r\n");
      out.write("					email : {\r\n");
      out.write("						required : 'Por favor, informe o email do usuário.',\r\n");
      out.write("						email : 'Entre com um endereço de email válido.'\r\n");
      out.write("					},\r\n");
      out.write("\r\n");
      out.write("					senha : {\r\n");
      out.write("						required : 'Por favor, informe a senha do usuário.',\r\n");
      out.write("						minlength : 'Entre com no mínimo 8 caracteres.',\r\n");
      out.write("						maxlength : 'Entre com no máximo 20 caracteres'\r\n");
      out.write("					},\r\n");
      out.write("\r\n");
      out.write("					senhaConfirmacao : {\r\n");
      out.write("						required : 'Por favor, confirme a senha do usuário.',\r\n");
      out.write("						equalTo : 'Senhas não conferem, por favor verifique.'\r\n");
      out.write("					},\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		})\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f0_reused = false;
    try {
      _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f0.setParent(null);
      // /WEB-INF/views/register.jsp(41,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f0.setPath("model.nome");
      // /WEB-INF/views/register.jsp(41,7) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "name", "nome");
      // /WEB-INF/views/register.jsp(41,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f0.setId("nome");
      // /WEB-INF/views/register.jsp(41,7) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", "text");
      // /WEB-INF/views/register.jsp(41,7) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", "form-control");
      // /WEB-INF/views/register.jsp(41,7) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "placeholder", "Digite seu nome aqui");
      int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
        if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f0);
      _jspx_th_form_005finput_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f0, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f1_reused = false;
    try {
      _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f1.setParent(null);
      // /WEB-INF/views/register.jsp(46,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f1.setPath("model.quatroLetras");
      // /WEB-INF/views/register.jsp(46,7) null
      _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "name", "quatroLetras");
      // /WEB-INF/views/register.jsp(46,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f1.setId("quatroLetras");
      // /WEB-INF/views/register.jsp(46,7) null
      _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "type", "text");
      // /WEB-INF/views/register.jsp(46,7) null
      _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "class", "form-control");
      // /WEB-INF/views/register.jsp(46,7) null
      _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "placeholder", "Digite suas quatro letras aqui");
      int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
        if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f1);
      _jspx_th_form_005finput_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f1, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f2_reused = false;
    try {
      _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f2.setParent(null);
      // /WEB-INF/views/register.jsp(52,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f2.setPath("model.email");
      // /WEB-INF/views/register.jsp(52,7) null
      _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "name", "email");
      // /WEB-INF/views/register.jsp(52,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f2.setId("email");
      // /WEB-INF/views/register.jsp(52,7) null
      _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "type", "email");
      // /WEB-INF/views/register.jsp(52,7) null
      _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "class", "form-control");
      // /WEB-INF/views/register.jsp(52,7) null
      _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "placeholder", "Digite seu email aqui");
      int[] _jspx_push_body_count_form_005finput_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f2 = _jspx_th_form_005finput_005f2.doStartTag();
        if (_jspx_th_form_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f2);
      _jspx_th_form_005finput_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f2, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f3_reused = false;
    try {
      _jspx_th_form_005finput_005f3.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f3.setParent(null);
      // /WEB-INF/views/register.jsp(59,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f3.setPath("model.senha");
      // /WEB-INF/views/register.jsp(59,7) null
      _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "name", "senha");
      // /WEB-INF/views/register.jsp(59,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f3.setId("senha");
      // /WEB-INF/views/register.jsp(59,7) null
      _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "type", "password");
      // /WEB-INF/views/register.jsp(59,7) null
      _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "class", "form-control");
      // /WEB-INF/views/register.jsp(59,7) null
      _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "placeholder", "Digite sua senha aqui");
      int[] _jspx_push_body_count_form_005finput_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f3 = _jspx_th_form_005finput_005f3.doStartTag();
        if (_jspx_th_form_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f3.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f3);
      _jspx_th_form_005finput_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f3, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f4 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f4_reused = false;
    try {
      _jspx_th_form_005finput_005f4.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f4.setParent(null);
      // /WEB-INF/views/register.jsp(65,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f4.setPath("model.senhaConfirmacao");
      // /WEB-INF/views/register.jsp(65,7) null
      _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "name", "senhaConfirmacao");
      // /WEB-INF/views/register.jsp(65,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f4.setId("senhaConfirmacao");
      // /WEB-INF/views/register.jsp(65,7) null
      _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "type", "password");
      // /WEB-INF/views/register.jsp(65,7) null
      _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "class", "form-control");
      // /WEB-INF/views/register.jsp(65,7) null
      _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "placeholder", "Confirme sua senha aqui");
      int[] _jspx_push_body_count_form_005finput_005f4 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f4 = _jspx_th_form_005finput_005f4.doStartTag();
        if (_jspx_th_form_005finput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f4[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f4.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f4.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f4);
      _jspx_th_form_005finput_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f4, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f4_reused);
    }
    return false;
  }
}
