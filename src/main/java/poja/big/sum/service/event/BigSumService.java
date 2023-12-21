package poja.big.sum.service.event;

import java.math.BigInteger;
import org.springframework.stereotype.Service;

@Service
public class BigSumService {
  public BigInteger add(String a, String b) {
    BigInteger bigA = new BigInteger(a);
    BigInteger bigB = new BigInteger(b);
    return bigA.add(bigB);
  }
}
