package kazusato.app;

import java.io.InputStream;

public interface ArgumentResolver {

    Argument resolve(InputStream stream);

}
