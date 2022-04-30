package hello.core;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloLombok {
    private String name;
    private int age;
}
