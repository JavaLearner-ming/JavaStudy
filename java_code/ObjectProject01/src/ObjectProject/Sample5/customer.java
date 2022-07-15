package ObjectProject.Sample5;

import ObjectProject.Sample5.system.CustomerService;
import ObjectProject.Sample5.system.Language;

public class customer {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Language language = customerService.contact(66);
        language.voice();
    }
}
