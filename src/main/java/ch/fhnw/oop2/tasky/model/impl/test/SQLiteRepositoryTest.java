package ch.fhnw.oop2.tasky.model.impl.test;

import ch.fhnw.oop2.tasky.model.impl.InMemoryMapRepository;
import ch.fhnw.oop2.tasky.model.impl.SQLite;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SQLiteRepositoryTest extends RepositoryTest {
	private SQLite sqLite;

	@BeforeEach
	public void setUp() {
		sqLite = new SQLite(SQLite.Database.TEST);
		sqLite.setUp();
		repository = sqLite;
	}

	@AfterEach
	public void tearDown() {
		sqLite.disconnect();
		repository = null;
	}
}