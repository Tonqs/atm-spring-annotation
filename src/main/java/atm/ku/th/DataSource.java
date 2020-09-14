package atm.ku.th;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}
