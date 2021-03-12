package org.apricott;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Stream;

public class FOLLOW {
	public static final File RESTRICTED_ZONE = new File("server/restricted/zone");

    public static final Stream<String> listRestrictedFiles() throws IOException {
      return Files.walk(RESTRICTED_ZONE.toPath(), FileVisitOption.FOLLOW_LINKS)
          .map(Path::toAbsolutePath)
          .map(Path::toString);
    }
    
    public void method(Connection con) {
    	try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery( "" );
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
