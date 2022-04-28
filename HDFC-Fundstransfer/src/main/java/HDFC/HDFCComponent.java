package HDFC;

import org.apache.camel.component.connector.DefaultConnectorComponent;

/**
 * Camel HDFC connector
 */
public class HDFCComponent extends DefaultConnectorComponent {
    
    public HDFCComponent() {
        super("HDFC", "HDFC.HDFCComponent");
    }

    public HDFCComponent(String componentScheme) {
        super("HDFC", componentScheme, "HDFC.HDFCComponent");
    }

}
