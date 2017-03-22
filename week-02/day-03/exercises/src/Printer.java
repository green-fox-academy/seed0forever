public class Printer {

  public static void main(String[] args) {

// - Create a function called `printer`
//   which prints the input String parameters
//   (can have multiple number of arguments)
    printer("a", "bbb", "nnnnn", "", "5555", "however",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed porta, urna in tristique tempor, lorem odio condimentum risus, sed vulputate felis felis tincidunt turpis. Sed ultrices rutrum lacinia. Phasellus in tincidunt dolor. Ut sodales ex justo, eget vestibulum justo tempus at. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Maecenas gravida purus sed bibendum ullamcorper. Suspendisse varius luctus pellentesque. Aliquam hendrerit imperdiet ullamcorper. Etiam porttitor massa id hendrerit rutrum. Donec vitae mi at diam posuere sollicitudin sit amet vel mi. Sed commodo condimentum justo, ut semper elit. Nunc sollicitudin quam sit amet dignissim semper. Sed luctus at nulla eget vehicula.");
  }

  public static void printer(String... stringsToPrint) {
    for (String printElement : stringsToPrint) {
      System.out.println(printElement);
    }


  }

}
