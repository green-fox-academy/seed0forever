package annotations;

public @interface Monitor {

  String aspectRatio() default "4:3";
  String classification() default "TFT";
}
