/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-10-28 11:31:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eventos_002dcadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody;

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
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fname_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.release();
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Cadastro de Eventos</title>\r\n");
      out.write("<!-- CSS only -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("label.error {\r\n");
      out.write("	color: #d9534f;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.error, select.error, textarea.error {\r\n");
      out.write("	border: 1px solid #d9534f;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- Menu do sistema -->\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/components/menu.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/components/notifications.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container mt-4\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row mb-3\">\r\n");
      out.write("			<div class=\"col-md-12\">\r\n");
      out.write("				<h4>\r\n");
      out.write("					<strong>GFT Milhas</strong> Cadastro de Eventos\r\n");
      out.write("				</h4>\r\n");
      out.write("				Preencha o formulário para incluir um evento:\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<form id=\"formCadastro\" action=\"cadastrar-evento\" method=\"post\"\r\n");
      out.write("			class=\"mb-3\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"row mb-3\">\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<label>Nome do evento:</label>\r\n");
      out.write("					");
      if (_jspx_meth_form_005finput_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-2\">\r\n");
      out.write("					<label>Data Início:</label>\r\n");
      out.write("					");
      if (_jspx_meth_form_005finput_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-2\">\r\n");
      out.write("					<label>Data Término:</label>\r\n");
      out.write("					");
      if (_jspx_meth_form_005finput_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("\r\n");
      out.write("				<input type=\"submit\" value=\"Realizar Cadastro\"\r\n");
      out.write("					class=\"btn btn-success\" /> <a\r\n");
      out.write("					href=\"/projeto-milhas/eventos-consulta\" class=\"btn btn-secondary\">\r\n");
      out.write("					Voltar para a consulta </a>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- JS do bootstrap -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- JS do jquery -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- JS do jquery validation (posicionados após a referencia do JQuery JS) -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/jquery.validate.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/additional-methods.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		$(document)\r\n");
      out.write("				.ready(\r\n");
      out.write("						function() {\r\n");
      out.write("\r\n");
      out.write("							$(\"#formCadastro\")\r\n");
      out.write("									.validate(\r\n");
      out.write("											{\r\n");
      out.write("\r\n");
      out.write("												//Regras de validação dos campos\r\n");
      out.write("												rules : {\r\n");
      out.write("\r\n");
      out.write("													'nome' : {\r\n");
      out.write("														required : true\r\n");
      out.write("													},\r\n");
      out.write("													'dataInicio' : {\r\n");
      out.write("														required : true\r\n");
      out.write("													},\r\n");
      out.write("\r\n");
      out.write("													'dataFinal' : {\r\n");
      out.write("														required : true\r\n");
      out.write("													},\r\n");
      out.write("\r\n");
      out.write("												},\r\n");
      out.write("\r\n");
      out.write("												//Mensagens de validação dos campos\r\n");
      out.write("												messages : {\r\n");
      out.write("\r\n");
      out.write("													nome : {\r\n");
      out.write("														required : 'Por favor, informe o nome do evento.'\r\n");
      out.write("													},\r\n");
      out.write("													dataInicio : {\r\n");
      out.write("														required : 'Por favor, selecione a data inicial do evento.'\r\n");
      out.write("													},\r\n");
      out.write("													dataFinal : {\r\n");
      out.write("														required : 'Por favor, selecione a data final do evento.'\r\n");
      out.write("													},\r\n");
      out.write("\r\n");
      out.write("												}\r\n");
      out.write("\r\n");
      out.write("											});\r\n");
      out.write("\r\n");
      out.write("						})\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("</body>");
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
      // /WEB-INF/views/eventos-cadastro.jsp(49,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f0.setPath("model.nome");
      // /WEB-INF/views/eventos-cadastro.jsp(49,5) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f0.setId("nome");
      // /WEB-INF/views/eventos-cadastro.jsp(49,5) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "name", "nome");
      // /WEB-INF/views/eventos-cadastro.jsp(49,5) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", "text");
      // /WEB-INF/views/eventos-cadastro.jsp(49,5) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", "form-control");
      // /WEB-INF/views/eventos-cadastro.jsp(49,5) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "placeholder", "Digite o nome aqui.");
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
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f1_reused = false;
    try {
      _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f1.setParent(null);
      // /WEB-INF/views/eventos-cadastro.jsp(54,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f1.setPath("model.dataInicio");
      // /WEB-INF/views/eventos-cadastro.jsp(54,5) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f1.setId("dataInicio");
      // /WEB-INF/views/eventos-cadastro.jsp(54,5) null
      _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "name", "data");
      // /WEB-INF/views/eventos-cadastro.jsp(54,5) null
      _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "type", "date");
      // /WEB-INF/views/eventos-cadastro.jsp(54,5) null
      _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "class", "form-control");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f1);
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
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f2_reused = false;
    try {
      _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f2.setParent(null);
      // /WEB-INF/views/eventos-cadastro.jsp(59,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f2.setPath("model.dataFinal");
      // /WEB-INF/views/eventos-cadastro.jsp(59,5) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f2.setId("dataFinal");
      // /WEB-INF/views/eventos-cadastro.jsp(59,5) null
      _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "name", "data");
      // /WEB-INF/views/eventos-cadastro.jsp(59,5) null
      _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "type", "date");
      // /WEB-INF/views/eventos-cadastro.jsp(59,5) null
      _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "class", "form-control");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f2);
      _jspx_th_form_005finput_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f2, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f2_reused);
    }
    return false;
  }
}
