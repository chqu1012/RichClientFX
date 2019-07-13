package de.dc.javafx.xcore.workbench.lecture.ui.template;

import de.dc.javafx.xcore.workbench.lecture.Content;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.Section;
import de.dc.javafx.xcore.workbench.lecture.ui.template.LectureStringSwitch;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class LectureTemplate {
  private LectureStringSwitch stringSwitch = new LectureStringSwitch();
  
  public String gen(final LectureProject p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!doctype html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<title>reveal.js</title>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" href=\"css/reset.css\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" href=\"css/reveal.css\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" href=\"css/theme/black.css\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<!-- Theme used for syntax highlighting of code -->");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" href=\"lib/css/monokai.css\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<!-- Printing and PDF exports -->");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("var link = document.createElement( \'link\' );");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("link.rel = \'stylesheet\';");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("link.type = \'text/css\';");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("link.href = window.location.search.match( /print-pdf/gi ) ? \'css/print/pdf.css\' : \'css/print/paper.css\';");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("document.getElementsByTagName( \'head\' )[0].appendChild( link );");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"reveal\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div class=\"slides\">");
    _builder.newLine();
    {
      EList<Section> _sections = p.getSections();
      for(final Section section : _sections) {
        _builder.append("\t\t\t\t");
        StringConcatenation _builder_1 = new StringConcatenation();
        {
          boolean _isUseMarkDown = section.isUseMarkDown();
          if (_isUseMarkDown) {
            _builder_1.append("data-markdown");
          }
        }
        final String useMarkDown = _builder_1.toString();
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("<section ");
        _builder.append(useMarkDown, "\t\t\t\t");
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("<h1>");
        String _name = section.getName();
        _builder.append(_name, "\t\t\t\t");
        _builder.append("</h1>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("<p>");
        _builder.newLine();
        {
          EList<Content> _contents = section.getContents();
          boolean _tripleNotEquals = (_contents != null);
          if (_tripleNotEquals) {
            {
              EList<Content> _contents_1 = section.getContents();
              for(final Content content : _contents_1) {
                _builder.append("\t\t\t\t");
                String _doSwitch = this.stringSwitch.doSwitch(content);
                _builder.append(_doSwitch, "\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t\t\t\t");
        _builder.append("</p>");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("</section>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"js/reveal.js\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// More info about config & dependencies:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// - https://github.com/hakimel/reveal.js#configuration");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// - https://github.com/hakimel/reveal.js#dependencies");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Reveal.initialize({");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("dependencies: [");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("{ src: \'plugin/markdown/marked.js\' },");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("{ src: \'plugin/markdown/markdown.js\' },");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("{ src: \'plugin/notes/notes.js\', async: true },");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("{ src: \'plugin/highlight/highlight.js\', async: true }");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder.toString();
  }
}
