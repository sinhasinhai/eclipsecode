package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;
import org.eclipse.help.webapp.*;

public final class searchView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/advanced/header.jsp");
    _jspx_dependants.add("/advanced/searchList.css");
    _jspx_dependants.add("/advanced/darkTheme.css");
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
 
	SearchData data = new SearchData(application, request, response);
	WebappPreferences prefs = data.getPrefs();

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"");
      out.print(ServletResources.getString("locale", request));
      out.write("\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"Expires\" content=\"-1\">\n");
      out.write("\n");
      out.write("<title>");
      out.print(ServletResources.getString("SearchResults", request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("/*******************************************************************************\n");
      out.write(" * Copyright (c) 2000, 2011 IBM Corporation and others.\n");
      out.write(" *\n");
      out.write(" * This program and the accompanying materials \n");
      out.write(" * are made available under the terms of the Eclipse Public License 2.0\n");
      out.write(" * which accompanies this distribution, and is available at\n");
      out.write(" * https://www.eclipse.org/legal/epl-2.0/\n");
      out.write(" *\n");
      out.write(" * SPDX-License-Identifier: EPL-2.0\n");
      out.write(" * \n");
      out.write(" * Contributors:\n");
      out.write(" *     IBM Corporation - initial API and implementation\n");
      out.write(" *******************************************************************************/\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    ");
      out.print(prefs.getViewBackgroundStyle());
      out.write("\n");
      out.write("\tcolor: WindowText;\n");
      out.write("\tfont: ");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("\tpadding: 0px;\n");
      out.write("\tborder: 0px;\n");
      out.write("\tmargin-top: 5px;\n");
      out.write("\tmargin-bottom: 8px;\n");
      out.write("\tmargin-left: 5px;\n");
      out.write("\tmargin-right: 5px;\n");
      out.write("\tcursor: default;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("\tfont: ");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("\twidth: 100%;\n");
      out.write("\ttable-layout: fixed;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("\ttext-decoration:none; \n");
      out.write("\tpadding:0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover {\n");
      out.write("\ttext-decoration:underline; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".category {\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tmargin-top: 5px;\n");
      out.write("\tmargin-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sectiontitle {\n");
      out.write("\tbackground-color: ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tmargin-top:7px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".results .active { \n");
      out.write("\tbackground:Highlight;\n");
      out.write("\tcolor:HighlightText;\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".showall {\n");
      out.write("    text-decoration:underline; \n");
      out.write("    color:#0066FF; \n");
      out.write("\tcursor:pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tdisplay:none;\n");
      out.write("\tbackground:");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tborder:2px outset;\n");
      out.write("\tpadding:2px 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".selectedMenuItem {\n");
      out.write("\tbackground:Highlight;\n");
      out.write("\tcolor:HighlightText;\n");
      out.write("\tpadding-left:10px;\n");
      out.write("\tpadding-right:10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".unselectedMenuItem {\n");
      out.write("\tbackground:");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tcolor:WindowText;\n");
      out.write("\tpadding-left:10px;\n");
      out.write("\tpadding-right:10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".icon {\n");
      out.write("\twidth: 23px;\n");
      out.write("\tpadding-");
      out.print(isRTL?"right":"left");
      out.write(':');
      out.write(' ');
      out.print(data.isShowCategories() ? 3 : 0);
      out.write("px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".description {\n");
      out.write("\tdisplay: ");
      out.print(data.isShowDescriptions() ? "block" : "none");
      out.write(";\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (prefers-color-scheme: dark) {\n");
      out.write("\tbody { \n");
      out.write("\t\tcolor: #f0f0f0; \n");
      out.write("\t\tbackground: #3d3d3d;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#titleText,\n");
      out.write("\t#searchLabel,\n");
      out.write("\t#scopeLabel,\n");
      out.write("\t#scope,\n");
      out.write("\ta,\n");
      out.write("\ta.active\n");
      out.write("\ta.nolink:link, \n");
      out.write("\ta.nolink:visited {\n");
      out.write("\t\tcolor:#ffffff;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.button a:hover, .buttonMenu a:hover { \n");
      out.write("\t\tborder-top:1px solid #3d3d3d; \n");
      out.write("\t\tborder-");
      out.print(isRTL?"right":"left");
      out.write(":1px solid #3d3d3d; \n");
      out.write("\t\tborder-");
      out.print(isRTL?"left":"right");
      out.write(":1px solid #3d3d3d; \n");
      out.write("\t\tborder-bottom:1px solid #3d3d3d;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\ttable {\n");
      out.write("\t\tbackground:#3d3d3d;\n");
      out.write("\t}\n");
      out.write("\t.tab {\n");
      out.write("\t\tbackground:#7b7c7b\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tform {\n");
      out.write("\t\tbackground:#3d3d3d;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.separator {\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tinput{\n");
      out.write("\t\tbackground:#a0a0a0;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.button a, .buttonMenu a { \n");
      out.write("\t\tborder:1px solid #3d3d3d;;\n");
      out.write("\t}\n");
      out.write("}");
      out.write('\n');
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<base target=\"ContentViewFrame\">\n");
      out.write("<script type=\"text/javascript\" src=\"utils.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"list.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"view.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\t\n");
      out.write("\n");
      out.write("var cookiesRequired = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("cookiesRequired", request)));
      out.write("\";\t\n");
      out.write("var showCategories = ");
      out.print(data.isShowCategories());
      out.write(";\n");
      out.write("var scope =\"");
      out.print(UrlUtil.JavaScriptEncode(data.getScope()));
      out.write("\";\n");
      out.write("\n");
      out.write("function refresh() { \n");
      out.write("\twindow.location.replace(\"searchView.jsp?");
      out.print(UrlUtil.JavaScriptEncode(request.getQueryString()));
      out.write("\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("function isShowDescriptions() {\n");
      out.write("\tvar value = getCookie(\"showDescriptions\");\n");
      out.write("\treturn value ? value == \"true\" : true;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function setShowCategories(value) { \t    \n");
      out.write("\tparent.searchToolbarFrame.setButtonState(\"show_categories\", value);\n");
      out.write("\tvar searchWord = \"");
      out.print(UrlUtil.JavaScriptEncode(data.getSearchWord()));
      out.write("\";\n");
      out.write("\t    window.location=\"searchView.jsp?searchWord=\" + encodeURIComponent(searchWord) \n");
      out.write("\t       + \"&showSearchCategories=\" + value +\n");
      out.write("\t       \"&scope=\" + encodeURIComponent(scope);    \n");
      out.write("}\n");
      out.write("\n");
      out.write("function setShowDescriptions(value) {\n");
      out.write("\tsetCookie(\"showDescriptions\", value);\n");
      out.write("\tvar newValue = isShowDescriptions();   \t\n");
      out.write("\tparent.searchToolbarFrame.setButtonState(\"show_descriptions\", newValue);\n");
      out.write("\tif (value != newValue) {\n");
      out.write("\t    alert(cookiesRequired);\n");
      out.write("\t} else { \n");
      out.write("\t    setCSSRule(\".description\", \"display\", value ? \"block\" : \"none\");\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function toggleShowCategories() {\n");
      out.write("\tsetShowCategories(!showCategories);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function toggleShowDescriptions() {\n");
      out.write("\tsetShowDescriptions(!isShowDescriptions());\n");
      out.write("}\n");
      out.write("\n");
      out.write("function onShow() { \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body dir=\"");
      out.print(direction);
      out.write("\">\n");
      out.write("\n");

	String preResults = data.getPreProcessorResults();

	if (!preResults.equals(""))
	{
		out.write(preResults);
		out.write("<HR/>");
	}


if (!data.isSearchRequest()) {
	out.write(ServletResources.getString("doSearch", request));
} else if (data.getQueryExceptionMessage()!=null) {
	out.write(data.getQueryExceptionMessage());
} else if (data.isProgressRequest()) {

      out.write("\n");
      out.write("\n");
      out.write("<CENTER>\n");
      out.write("<TABLE BORDER='0'>\n");
      out.write("\t<TR><TD>");
      out.print(ServletResources.getString("Indexing", request));
      out.write("</TD></TR>\n");
      out.write("\t<TR><TD ALIGN='");
      out.print(isRTL?"RIGHT":"LEFT");
      out.write("'>\n");
      out.write("\t\t<DIV STYLE='width:100px;height:16px;border:1px solid ThreeDShadow;'>\n");
      out.write("\t\t\t<DIV ID='divProgress' STYLE='width:");
      out.print(data.getIndexedPercentage());
      out.write("px;height:100%;background-color:Highlight'></DIV>\n");
      out.write("\t\t</DIV>\n");
      out.write("\t</TD></TR>\n");
      out.write("\t<TR><TD>");
      out.print(data.getIndexedPercentage());
      out.write('%');
      out.write(' ');
      out.print(ServletResources.getString("complete", request));
      out.write("</TD></TR>\n");
      out.write("\t<TR><TD><br>");
      out.print(ServletResources.getString("IndexingPleaseWait", request));
      out.write("</TD></TR>\n");
      out.write("</TABLE>\n");
      out.write("</CENTER>\n");
      out.write("<script language='JavaScript'>\n");
      out.write("setTimeout('refresh()', 2000);\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");

	return;
} else if (data.getResultsCount() == 0){
	out.write(UrlUtil.htmlEncode(data.getNotFoundMessage()));   
    if (data.isScopeActive()) {

      out.write("\n");
      out.write("<a class=\"showall\" onclick=\"showAll();\" >");
      out.print(ServletResources.getString("showAllLink", request));
      out.write("</a>\n");

    }
} else { // data.getResultsCount() != 0

      out.write("\n");
      out.write("<p><b>");
      out.print(UrlUtil.htmlEncode(data.getMatchesInScopeMessage()));
      out.write("</b>\n");

    if (data.isScopeActive()) {

      out.write("\n");
      out.write("&nbsp;<a class=\"showall\" onclick=\"showAll();\" >");
      out.print(ServletResources.getString("showAllLink", request));
      out.write("</a>\n");
 
    } else {

      out.write("\n");
      out.write("    &nbsp;<a class=\"showall\" onclick=\"rescope();\" >");
      out.print(ServletResources.getString("changeScopeLink", request));
      out.write("</a>\n");

    }

      out.write("\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table class=\"results\" cellspacing='0'>\n");
      out.write("\n");

	String oldCat = null;
	for (int topic = 0; topic < data.getResultsCount(); topic++)
	{
		if(data.isActivityFiltering() && !data.isEnabled(topic)){
			continue;
		}

		String cat = data.getCategoryLabel(topic);
		if (data.isShowCategories() && cat != null
				&& (oldCat == null || !oldCat.equals(cat))) {

      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<table class=\"category\" cellspacing='0'>\n");
      out.write("\t<tr class='list' id='r");
      out.print(topic);
      out.write("c'>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t\t<a href=\"");
      out.print(UrlUtil.htmlEncode(data.getCategoryHref(topic)));
      out.write("\"\n");
      out.write("\t\t\t\t\tid=\"a");
      out.print(topic);
      out.write("c\"'\n");
      out.write("\t\t\t\t\tclass=\"link\"\n");
      out.write("\t\t\t\t\tonmouseover=\"showStatus(event);return true;\"\n");
      out.write("\t\t\t\t\tonmouseout=\"clearStatus();return true;\">\n");
      out.write("\t\t\t\t");
      out.print(UrlUtil.htmlEncode(cat));
      out.write("\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("<table class=\"results\" cellspacing='0'>\n");
      out.write("\n");

			oldCat = cat;
		}

      out.write("\n");
      out.write("\n");
      out.write("<tr class='list' id='r");
      out.print(topic);
      out.write("'>\n");
      out.write("\t<td class='icon'>\n");
      out.write("\n");

		boolean isPotentialHit = data.isPotentialHit(topic);
		if (isPotentialHit) {

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<img src=\"");
      out.print(prefs.getImagesDirectory());
      out.write("/d_topic.svg\" alt=\"\"/>\n");
      out.write("\n");

		}
		else {

      out.write("\n");
      out.write("\n");
      out.write("\t<img src=\"");
      out.print(prefs.getImagesDirectory());
      out.write("/topic.svg\" alt=\"\"/>\n");
      out.write("\n");

		}

      out.write("\n");
      out.write("\n");
      out.write("\t</td>\n");
      out.write("\t<td align='");
      out.print(isRTL?"right":"left");
      out.write("'>\n");
      out.write("\t\t<a class='link' id='a");
      out.print(topic);
      out.write("' \n");
      out.write("\t\t   href=\"");
      out.print(UrlUtil.htmlEncode(data.getTopicHref(topic)));
      out.write("\" \n");
      out.write("\t\t   onmouseover=\"showStatus(event);return true;\"\n");
      out.write("\t\t   onmouseout=\"clearStatus();return true;\"\n");
      out.write("\t\t   title=\"");
      out.print(data.getTopicTocLabel(topic));
      out.write("\">\n");
      out.write("\n");

		String label = null;
		if (isPotentialHit) {
            label = ServletResources.getString("PotentialHit", data.getTopicLabel(topic), request);
        }
        else {
            label = data.getTopicLabel(topic);
        }

      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.print(label);
      out.write("</a>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("\n");

		String desc = data.getTopicDescription(topic);
		if (desc!=null) {

      out.write("\n");
      out.write("<tr id='d");
      out.print(topic);
      out.write("'>\n");
      out.write("\t<td class='icon'>\n");
      out.write("\t</td>\n");
      out.write("\t<td align='");
      out.print(isRTL?"right":"left");
      out.write("'>\n");
      out.write("\t\t<div class=\"description\">\n");
      out.write("\t\t\t");
      out.print(desc);
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");

		}
	}

      out.write("\n");
      out.write("</table>\n");
      out.write("\n");

}

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tselectTopicById('");
      out.print(UrlUtil.JavaScriptEncode(data.getSelectedTopicId()));
      out.write("');\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
