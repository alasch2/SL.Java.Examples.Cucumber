package io.sl.ex.cucumber3.junit4;

import java.util.Locale;
import java.util.Map;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class GroceryTable {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Grocery {
        private String name;
        private Integer price;
    }
    
    public static class GroceryTableTransformer implements TypeRegistryConfigurer {
		@Override
        public Locale locale() {
            return Locale.ENGLISH;
        }

		@Override
        public void configureTypeRegistry(TypeRegistry typeRegistry) {
            typeRegistry.defineDataTableType(new DataTableType(Grocery.class,
                            (Map<String, String> row) -> {
                                String product = row.get("name");
                                Integer price = Integer.parseInt(row.get("price"));
                                return new Grocery(product, price);
                            }
                    )
            );
        }

    }

}
