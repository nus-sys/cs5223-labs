package dslabs.testsuites;

import dslabs.shardkv.ShardStorePart1RepTest;
import dslabs.shardkv.ShardStorePart2RepTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@RunWith(Suite.class)
@Suite.SuiteClasses({ShardStorePart1RepTest.class, ShardStorePart2RepTest.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public interface Lab4Part4TestSuite {
}
