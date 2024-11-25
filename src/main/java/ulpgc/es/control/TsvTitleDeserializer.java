package ulpgc.es.control;

import ulpgc.es.model.Title;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TsvTitleDeserializer implements TitleDeserializer{
    @Override
    public Title deserialize(String content) {
        String[] fields = content.split("\t");
        System.out.printf(fields[0]);
        return new Title(fields[0], Title.TitleType.valueOf(capitalize(fields[1])), fields[2]);
    }

    private String capitalize(String value) {
        return value.substring(0,1).toUpperCase() + value.substring(1);
    }
}