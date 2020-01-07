package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;
import org.eclipse.help.webapp.*;

public final class bookmarksView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/advanced/header.jsp");
    _jspx_dependants.add("/advanced/list.css");
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
 
	BookmarksData data = new BookmarksData(application,request, response);
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
      out.print(ServletResources.getString("Bookmarks", request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("/*******************************************************************************\n");
      out.write(" * Copyright (c) 2000, 2004 IBM Corporation and others.\n");
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
      out.write("BODY {\n");
      out.write("\tcolor:WindowText;\n");
      out.write("\tfont: ");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("\tmargin-top:5px;\n");
      out.write("\tmargin-");
      out.print(isRTL?"right":"left");
      out.write(":5px;\n");
      out.write("\tpadding:0;\n");
      out.write("\tborder:0;\n");
      out.write("\tcursor:default;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A {\n");
      out.write("\ttext-decoration:none; \n");
      out.write("\tcolor:WindowText; \n");
      out.write("\tpadding:0px;\n");
      out.write("\twhite-space: nowrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A:hover {\n");
      out.write("\ttext-decoration:underline; \n");
      out.write("}\n");
      out.write("\n");
      out.write("IMG {\n");
      out.write("\tborder:0px;\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("\tmargin-");
      out.print(isRTL?"left":"right");
      out.write(":4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("TABLE {\n");
      out.write("\tfont: ");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("\twidth:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".list {\n");
      out.write("\tpadding:2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sectiontitle {\n");
      out.write("\tbackground-color: ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tmargin-top:7px;\n");
      out.write("}\n");
      out.write("     \n");
      out.write(".active { \n");
      out.write("\tbackground:Highlight;\n");
      out.write("\tcolor:HighlightText;\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".label {\n");
      out.write("\tmargin-");
      out.print(isRTL?"right":"left");
      out.write(":4px;\n");
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
      out.write(".score {\n");
      out.write("\tpadding-");
      out.print(isRTL?"left":"right");
      out.write(":5px;\n");
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
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<base target=\"ContentViewFrame\">\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"utils.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"list.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\t\t\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Removes bookmark \n");
      out.write(" */\n");
      out.write("function removeBookmark() \n");
      out.write("{\n");
      out.write("\tif (!active) \n");
      out.write("\t\treturn false;\n");
      out.write("\t\t\n");
      out.write("\tvar bookmark = active;\n");
      out.write("\tactive = null;\n");
      out.write("\t\n");
      out.write("\t// Note: bookmark is an anchor \"a\"\n");
      out.write("\tvar url = bookmark.href;\n");
      out.write("\tvar i = url.indexOf(\"/topic/\");\n");
      out.write("\tif (i >=0 )\n");
      out.write("\t\turl = url.substring(i+6);\n");
      out.write("\t// remove any query string\n");
      out.write("\ti = url.indexOf(\"?\");\n");
      out.write("\tif (i >= 0)\n");
      out.write("\t\turl = url.substring(0, i);\n");
      out.write("\t\t\n");
      out.write("\tvar title = bookmark.title;\n");
      out.write("\tif (title == null || title == \"\")\n");
      out.write("\t\ttitle = url;\n");
      out.write("\t\t\t\n");
      out.write("\twindow.location.replace(\"bookmarksView.jsp?operation=remove&bookmark=\"+encodeURIComponent(url)+\"&title=\"+encodeURIComponent(title));\n");
      out.write("\treturn true;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Removes all bookmarks\n");
      out.write(" */\n");
      out.write("function removeAllBookmarks() \n");
      out.write("{\n");
      out.write("\thidePopupMenu();\n");
      out.write("\tif(!confirm(\"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("confirmDeleteAllBookmarks",request)));
      out.write("\"))\n");
      out.write("\t\treturn true;\n");
      out.write("\twindow.location.replace(\"bookmarksView.jsp?operation=removeAll\");\n");
      out.write("\treturn true;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * If the Del key was pressed, remove the bookmark\n");
      out.write(" */\n");
      out.write("function bookmarkKeyDownHandler(e) {\n");
      out.write("\tvar key;\n");
      out.write("\t\n");
      out.write("\tif (isIE) {\n");
      out.write("\t\tkey = window.event.keyCode;\n");
      out.write("\t} else {\n");
      out.write("\t\tkey = e.keyCode;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t// Check if this is the Delete key (code 46)\n");
      out.write("\tif (key != 46)\n");
      out.write("\t\treturn true;\n");
      out.write("\t\t\n");
      out.write("\tif (isIE) {\n");
      out.write("\t\twindow.event.cancelBubble = true;\n");
      out.write("\t} else {\n");
      out.write("\t    e.cancelBubble = true;\n");
      out.write("\t}\n");
      out.write("  \t\n");
      out.write("  \treturn removeBookmark();\n");
      out.write("}\n");
      out.write("\n");
      out.write("function onShow() { \n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body dir=\"");
      out.print(direction);
      out.write("\">\n");
      out.write(" \n");

if(data.getBookmarks().length == 0) {
	out.write(ServletResources.getString("addBookmark", request));
} else {

      out.write("\n");
      out.write("<table id='list'  cellspacing='0' >\n");
      out.write("\n");

	Topic[] bookmarks = data.getBookmarks();
	for (int i=0; i<bookmarks.length; i++) 
	{

      out.write("\n");
      out.write("\n");
      out.write("<tr class='list' id='r");
      out.print(i);
      out.write("'>\n");
      out.write("\t<td align='");
      out.print(isRTL?"right":"left");
      out.write("' class='label' nowrap>\n");
      out.write("\t\t<a id='a");
      out.print(i);
      out.write("' \n");
      out.write("\t\t   href='");
      out.print(UrlUtil.htmlEncode(bookmarks[i].getHref()));
      out.write("' \n");
      out.write("\t\t   onmouseover=\"showStatus(event);return true;\"\n");
      out.write("\t\t   onmouseout=\"clearStatus();return true;\"\n");
      out.write("\t\t   oncontextmenu=\"contextMenuHandler(event);return false;\"\n");
      out.write("\t\t   onkeydown=\"bookmarkKeyDownHandler(event);\"\n");
      out.write("\t\t   title=\"");
      out.print(UrlUtil.htmlEncode(bookmarks[i].getLabel()));
      out.write("\">\n");
      out.write("\t\t   <img src=\"");
      out.print(prefs.getImagesDirectory());
      out.write("/topic.svg\" alt=\"\">");
      out.print(UrlUtil.htmlEncode(bookmarks[i].getLabel()));
      out.write("</a>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("\n");

	}

      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<div id=\"menu\">\n");
      out.write("\t<div class=\"unselectedMenuItem\" onmouseover=\"this.className='selectedMenuItem'\" onmouseout=\"this.className='unselectedMenuItem'\" onclick=\"removeBookmark()\" ><nobr>");
      out.print(ServletResources.getString("RemoveBookmark",request));
      out.write("</nobr></div>\n");
      out.write("\t<div class=\"unselectedMenuItem\" onmouseover=\"this.className='selectedMenuItem'\" onmouseout=\"this.className='unselectedMenuItem'\" onclick=\"removeAllBookmarks()\" ><nobr>");
      out.print(ServletResources.getString("RemoveAllBookmarks",request));
      out.write("</nobr></div>\n");
      out.write("</div>\n");
      out.write("\n");

}

      out.write("\n");
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
