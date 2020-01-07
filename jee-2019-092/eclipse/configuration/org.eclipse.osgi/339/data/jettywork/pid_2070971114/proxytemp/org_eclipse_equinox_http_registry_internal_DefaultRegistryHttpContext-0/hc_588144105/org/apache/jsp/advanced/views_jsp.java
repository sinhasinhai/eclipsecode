package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;
import org.eclipse.help.webapp.*;

public final class views_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/advanced/header.jsp");
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

      out.write(" \n");
      out.write(" <!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">\n");
      out.write("<!--\n");
      out.write(" ! Copyright (c) 2000, 2018 IBM Corporation and others.\n");
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
 
	LayoutData data = new LayoutData(application,request, response);
	WebappPreferences prefs = data.getPrefs();
	AbstractView[] views = data.getViews();	

      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"");
      out.print(ServletResources.getString("locale", request));
      out.write("\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("\n");
      out.write("<title>");
      out.print(ServletResources.getString("Views", request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("/* need this one for Mozilla */\n");
      out.write("HTML { \n");
      out.write("\twidth:100%;\n");
      out.write("\theight:100%;\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("\tborder:0px;\n");
      out.write(" }\n");
      out.write("\n");
      out.write("BODY {\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("\t/* Mozilla does not like width:100%, so we set height only */\n");
      out.write("\theight:100%;\n");
      out.write("\tposition:relative; /* Needed for Safari */\n");
      out.write("}\n");
      out.write("\n");
      out.write("IFRAME {\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:100%;\n");
      out.write("\tposition:absolute; /* Needed for Safari */\n");
      out.write("\ttop:0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".hidden {\n");
      out.write("\tvisibility:hidden;\n");
      out.write("\twidth:0;\n");
      out.write("\theight:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".visible {\n");
      out.write("\tvisibility:visible;\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\" src=\"views.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("var activityFiltering = ");
      out.print((new ActivitiesData(application, request, response)).isActivityFiltering()?"true":"false");
      out.write(";\n");
      out.write("var displayShowAllConfirmation = ");
      out.print(prefs.isDontConfirmShowAll()?"false":"true");
      out.write(";\n");
      out.write("\n");
      out.write("function confirmShowAll()\n");
      out.write("{\n");

if (data.isIE()){

      out.write("\n");
      out.write("\tvar l = top.screenLeft + (top.document.body.clientWidth - w) / 2;\n");
      out.write("\tvar t = top.screenTop + (top.document.body.clientHeight - h) / 2;\n");

} else {

      out.write("\n");
      out.write("\tvar l = top.screenX + (top.innerWidth - w) / 2;\n");
      out.write("\tvar t = top.screenY + (top.innerHeight - h) / 2;\n");

}

      out.write("\n");
      out.write("\t// move the dialog just a bit higher than the middle\n");
      out.write("\tif (t-50 > 0) t = t-50;\n");
      out.write("\t\n");
      out.write("\twindow.location=\"javascript://needModal\";\n");
      out.write("\tconfirmShowAllDialog = window.open(\"confirmShowAll.jsp\", \"confirmShowAllDialog\", \"resizable=no,height=\"+h+\",width=\"+w+\",left=\"+l+\",top=\"+t );\n");
      out.write("\tconfirmShowAllDialog.focus(); \n");
      out.write("}\n");
      out.write("\n");
      out.write("function selectScope() \n");
      out.write("{\n");

if (data.isIE()){

      out.write("\n");
      out.write("\tvar l = top.screenLeft + (top.document.body.clientWidth - w) / 2;\n");
      out.write("\tvar t = top.screenTop + (top.document.body.clientHeight - h) / 2;\n");

} else {

      out.write("\n");
      out.write("\tvar l = top.screenX + (top.innerWidth - w) / 2;\n");
      out.write("\tvar t = top.screenY + (top.innerHeight - h) / 2;\n");

}

      out.write("\n");
      out.write("\t// move the dialog just a bit higher than the middle\n");
      out.write("\tif (t-50 > 0) t = t-50;\n");
      out.write("\t\n");
      out.write("\twindow.location=\"javascript://needModal\";\n");
      out.write("\tselectScopeDialog = window.open(\"selectScope.jsp\", \"selectScopeDialog\", \"resizable=no,height=\"+h+\",width=\"+w+\",left=\"+l+\",top=\"+t );\n");
      out.write("\tselectScopeDialog.focus(); \n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("   \n");
      out.write("<body dir=\"");
      out.print(direction);
      out.write("\" tabIndex=\"-1\" onunload=\"closeConfirmShowAllDialog()\">\n");

	for (int i=0; i<views.length; i++) 
	{
	    if (views[i].isVisible()) {
		    // normally we would hide the views first, but mozilla needs all iframes to be visible to load 
		    // other frames
		    String className =  data.getVisibleView().equals(views[i].getName()) ? "visible" : "hidden";

      out.write("\n");
      out.write(" \t<iframe frameborder=\"0\" \n");
      out.write(" \t\t    class=\"");
      out.print(className);
      out.write("\"  \n");
      out.write(" \t\t    name=\"");
      out.print(views[i].getName());
      out.write("\"\n");
      out.write(" \t\t    title=\"");
      out.print(ServletResources.getString("ignore", views[i].getName(), request));
      out.write("\"\n");
      out.write(" \t\t    id=\"");
      out.print(views[i].getName());
      out.write("\" \n");
      out.write(" \t\t    scrolling=\"no\"\n");
      out.write(" \t\t    src='");
      out.print("view.jsp?view="+views[i].getName()+(request.getQueryString()==null?"":("&"+UrlUtil.htmlEncode(request.getQueryString()))));
      out.write("'>\n");
      out.write(" \t</iframe> \n");

        }
	}

      out.write("\t\n");
      out.write("\n");
      out.write("</body>\n");
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
