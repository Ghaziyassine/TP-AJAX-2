package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.school.service.MarqueService;
import ma.school.beans.Marque;
import ma.school.service.MachineService;
import java.util.List;
import ma.school.beans.Machine;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/template/menu.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Graphique de machines par marque</title>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\n");
      out.write("    <link href=\"style/monStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f7f7f7;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        canvas#machineChart {\n");
      out.write("            width: 80%;\n");
      out.write("            max-width: 800px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("    <li><a class=\"active\" href=\"home.jsp\">Home</a></li>\n");
      out.write("    <li><a href=\"etudiantForm.jsp\">Gestion des etudiants</a></li>\n");
      out.write("    <li><a href=\"marqueForm.jsp\">Gestion des marques</a></li>\n");
      out.write("    <li><a href=\"machineForm.jsp\">Gestion des machines</a></li>\n");
      out.write("    <li><a href=\"machineByMarqueForm.jsp\">Machines par marque</a></li>\n");
      out.write("    <li><a href=\"MachineByReference.jsp\">Machines par Reference</a></li>\n");
      out.write("\n");
      out.write("</ul>");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"background-color: #fff; border: 1px solid #ddd; padding: 20px;\">\n");
      out.write("    <h1 style=\"text-align: center;\">Graphique de machines par marque</h1>\n");
      out.write("    <canvas id=\"machineChart\"></canvas>\n");
      out.write("</div>\n");
      out.write("\n");

    // Remplacez cette partie avec le code Java pour récupérer les données de la base de données
    MachineService ms = new MachineService();
    MarqueService mrs = new MarqueService();
    List<Machine> machines = ms.findAll();
    List<Marque> marques = mrs.findAll();

      out.write("\n");
      out.write("<script>\n");
      out.write("    // Création d'un tableau pour stocker les données\n");
      out.write("    var labels = [];\n");
      out.write("    var data = [];\n");
      out.write("\n");
      out.write("    // Boucle pour extraire les données de la liste de machines\n");
      out.write("    ");

        for (Marque marque : marques) {
    
      out.write("\n");
      out.write("    labels.push(\"");
      out.print( marque.getLibelle());
      out.write("\"); // Remplacez par le nom de la propriété de la marque\n");
      out.write("    data.push(");
      out.print( ms.findByMarque(marque).size() );
      out.write("); // Remplacez par la propriété de la machine que vous souhaitez afficher\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("\n");
      out.write("    // Création du graphique\n");
      out.write("    var ctx = document.getElementById('machineChart').getContext('2d');\n");
      out.write("    var machineChart = new Chart(ctx, {\n");
      out.write("        type: 'bar',\n");
      out.write("        data: {\n");
      out.write("            labels: labels,\n");
      out.write("            datasets: [{\n");
      out.write("                label: 'Nombre de machines par marque',\n");
      out.write("                data: data,\n");
      out.write("                backgroundColor: [\n");
      out.write("                    'rgba(75, 192, 192, 0.6)',\n");
      out.write("                    'rgba(255, 99, 132, 0.6)',\n");
      out.write("                    'rgba(255, 206, 86, 0.6)',\n");
      out.write("                    'rgba(54, 162, 235, 0.6)',\n");
      out.write("                    'rgba(153, 102, 255, 0.6)',\n");
      out.write("                    'rgba(255, 159, 64, 0.6)'\n");
      out.write("                ], // Set different background colors for each bar\n");
      out.write("                borderColor: [\n");
      out.write("                    'rgba(75, 192, 192, 1)',\n");
      out.write("                    'rgba(255, 99, 132, 1)',\n");
      out.write("                    'rgba(255, 206, 86, 1)',\n");
      out.write("                    'rgba(54, 162, 235, 1)',\n");
      out.write("                    'rgba(153, 102, 255, 1)',\n");
      out.write("                    'rgba(255, 159, 64, 1)'\n");
      out.write("                ], // Set different border colors for each bar\n");
      out.write("                borderWidth: 1\n");
      out.write("            }]\n");
      out.write("        },\n");
      out.write("        options: {\n");
      out.write("            scales: {\n");
      out.write("                y: {\n");
      out.write("                    beginAtZero: true,\n");
      out.write("                    suggestedMax: 20\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
