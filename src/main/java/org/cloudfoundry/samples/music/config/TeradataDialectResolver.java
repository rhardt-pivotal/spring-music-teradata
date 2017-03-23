package org.cloudfoundry.samples.music.config;

import org.hibernate.dialect.TeradataDialect;
import org.hibernate.engine.jdbc.dialect.spi.BasicDialectResolver;

/**
 * Created by rhardt on 3/22/17.
 */
public class TeradataDialectResolver extends BasicDialectResolver{
    public TeradataDialectResolver() {
        super("teradata", TeradataDialect.class);
    }
}
