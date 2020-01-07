package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;
import org.eclipse.help.webapp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/advanced/fheader.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write('\n');
 
request.setCharacterEncoding("UTF-8");
boolean isRTL = UrlUtil.isRTL(request, response);
String  direction = isRTL?"rtl":"ltr";

      out.write("\n");
      out.write(" <!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">\n");
      out.write("<!--\n");
      out.write(" ! Copyright (c) 2000, 2007 IBM Corporation and others.\n");
      out.write(" !\n");
      out.write(" ! This program and the accompanying materials \n");
      out.write(" ! are made available under the terms of the Eclipse Public License 2.0\n");
      out.write(" ! which accompanies this distribution, and is available at\n");
      out.write(" ! https://www.eclipse.org/legal/epl-2.0/\n");
      out.write(" !\n");
      out.write(" ! SPDX-License-Identifier: EPL-2.0\n");
      out.write(" ! \n");
      out.write(" ! Contributors:\n");
      out.write(" !     IBM Corporation - initial API and implementation\n");
      out.write(" -->");
      out.write('\n');
      out.write('\n');
 
	new ActivitiesData(application, request, response); // here it can turn filtering on or off
	LayoutData data = new LayoutData(application,request, response);
	AbstractView view = data.getCurrentView();
	if (view == null) return;

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"");
      out.print(ServletResources.getString("locale", request));
      out.write("\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>");
      out.print(ServletResources.getString(view.getName(), request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function onloadHandler(e)\n");
      out.write("{\n");
      out.write("    resize();\n");
      out.write("}\n");
      out.write("\n");
      out.write("function resize()\n");
      out.write("{\n");
 if (data.isIE() || data.isMozilla() && "1.2.1".compareTo(data.getMozillaVersion()) <=0){

      out.write("\tvar titleText=window.");
      out.print(view.getName());
      out.write("ToolbarFrame.document.getElementById(\"titleText\");\n");
      out.write("\tif (!titleText) return;\n");
      out.write("\tvar h=titleText.offsetHeight; ");
      out.write("\n");
      out.write("\tif(h<=19){\n");
      out.write("\t\treturn; ");
      out.write("\n");
      out.write("\t}\n");
      out.write("\tdocument.getElementById(\"viewFrameset\").setAttribute(\"rows\", (11+h)+\",*\"); ");
      out.write("\n");
      out.write("\twindow.");
      out.print(view.getName());
      out.write("ToolbarFrame.document.getElementById(\"titleTextTableDiv\").style.height=(9+h)+\"px\"; ");
      out.write('\n');
}
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("var resized = false;\n");
      out.write("\n");
      out.write("// Called when the view is made visible. This function is needed because \n");
      out.write("// with IE the resize only works after the view has been displayed for the first time.\n");
      out.write("\n");
      out.write("function onShow() \n");
      out.write("{\n");
      out.write("    if (!resized) {\n");
      out.write("        resize();\n");
      out.write("        resized = true;\n");
      out.write("    }\n");
      out.write("    try{\n");
      out.write("\t\twindow.");
      out.print(view.getName());
      out.write("ViewFrame.onShow();\n");
      out.write("\t} catch(ex) {}\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<frameset id=\"viewFrameset\" onload=\"onloadHandler()\" rows=\"24,*\" frameborder=\"0\" framespacing=\"0\" border=0  >\n");
      out.write("\t<frame id=\"toolbar\" name=\"");
      out.print(view.getName());
      out.write("ToolbarFrame\" title=\"");
      out.print(ServletResources.getString(view.getName()+"ViewToolbar", request));
      out.write("\" \n");
      out.write("\t    src='");
      out.print(data.getAdvancedURL(view,"Toolbar.jsp"));
      out.write("'  marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" noresize=0>\n");
      out.write("\t");

	if (view.isDeferred()) {
	
      out.write("\n");
      out.write("\t\t<frame name='");
      out.print(view.getName());
      out.write("ViewFrame' title=\"");
      out.print(ServletResources.getString(view.getName()+"View", request));
      out.write("\" \n");
      out.write("\t\t    src='");
      out.print("deferredView.jsp?href="+data.getAdvancedURL(view,"View.jsp")+"?"+UrlUtil.htmlEncode(request.getQueryString()));
      out.write("'  marginwidth=\"10\" marginheight=\"0\" frameborder=\"0\" >\n");
      out.write("\t");

	}
	else {
	
      out.write("\n");
      out.write("\t\t<frame name='");
      out.print(view.getName());
      out.write("ViewFrame' title=\"");
      out.print(ServletResources.getString(view.getName()+"View", request));
      out.write("\" \n");
      out.write("\t\t    src='");
      out.print(data.getAdvancedURL(view,"View.jsp") + "?" + UrlUtil.htmlEncode(request.getQueryString()));
      out.write("'  marginwidth=\"10\" marginheight=\"0\" frameborder=\"0\" >\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("</frameset>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
