package patterns.dynamicfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FabricaDinamica {

    private Properties properties;

    public FabricaDinamica (String arquivo) throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream(arquivo));
    }

    public <E> E criaImplementacao (Class<E> eClass) {
        var nomeClass = properties.getProperty(eClass.getName());
        if (nomeClass == null) {
            throw new IllegalArgumentException();
        }
        try {
            var clazz = Class.forName(nomeClass);
            if (eClass.isAssignableFrom(clazz)) {
                return (E) clazz.newInstance();
            } else {
                throw new IllegalArgumentException();
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
