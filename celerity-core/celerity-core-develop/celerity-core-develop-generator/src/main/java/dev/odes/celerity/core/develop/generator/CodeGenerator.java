package dev.odes.celerity.core.develop.generator;

import dev.odes.celerity.core.develop.generator.constant.TemplateConstant;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

public class CodeGenerator {

  public void generate(TemplateContext templateContext) {
    VelocityInitializer.init();
    VelocityContext velocityContext = new VelocityContext();
    velocityContext.put("templateContext", templateContext);

    Map<String, String> templateFile = TemplateMethod.TEMPLATE_FILE;
    for (Map.Entry<String, String> entry : templateFile.entrySet()) {
      String fileName = entry.getKey();
      String templatePath = entry.getValue();
//      String entityCode = templateContext.getEntity().getCode();
      String entityCode = "";

      StringWriter stringWriter = new StringWriter();
      Template template = Velocity.getTemplate(templatePath, TemplateConstant.TEMPLATE_ENCODING);
      template.merge(velocityContext, stringWriter);
      String content = stringWriter.toString();

      String path = TemplateMethod.getFilePath(entityCode, fileName);

      try {
        FileUtils.writeStringToFile(new File(path), content, TemplateConstant.TEMPLATE_ENCODING);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

    }
  }
}
