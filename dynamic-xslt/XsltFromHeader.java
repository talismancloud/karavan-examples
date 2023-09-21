import org.apache.camel.BindToRegistry;
import org.apache.camel.Header;

@BindToRegistry("XsltFromHeader")
public class XsltFromHeader {
    public String myMethod(@Header("myXslt") String xslt) { return xslt; }
}