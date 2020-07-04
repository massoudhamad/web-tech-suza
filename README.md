# web-tech-suza
Example 1: jQuery Selectors and Operations
How it Works?

    The "query" in jQuery refers to querying or selecting element(s) in an HTML document for subsequent manipulations. For examples,
        $(document) selects the current document;
        $(p) selects all the <p> elements (Tag-Selector);
        $(#hello) and $(#message) select one element having attribute id="hello" (ID-Selector);
        $(.red) selects all the elements having attribute class="red" (Class-Selector).
        In fact, $() is the shorthand (alias) for the main jQuery() function.
    jQuery selector - the most important jQuery function - has a special syntax of $(). It could take a tag name, an id attribute (with prefix of #) or classname (with prefix of dot). In fact, it supports all the CSS Selectors!
    Comparing with JavaScript's many selector functions (such as document.getElementById(), document.getElementsByTagName(), document.getElementsByClassName(), document.getElementsByName(), document.querySelector(), document.querySelectorAll()), jQuery's selector is much simple and one class above.
    The $(document).ready(handler) attaches an event handler, which will be fired once the DOM tree is constructed. The "ready" event (new in jQuery) is slightly different from the JavaScript's "onload" event, which does not wait for the external references (such as images) to be loaded. We wrap our jQuery operations under the ready(), as these codes are placed in the <head> section, before the referenced elements are constructed in the <body>. This is a common jQuery practice.
    There are various methods available for manipulating the contents of the selected element(s). For example,
        html(): get the innerHTML.
        html(value): set the innerHTML.
        append(value): append at the end of the innerHTML.
        prepend(value): add in front of the innerHTML.
        before(element): add the element before the current element.
        after(element): add the element after the current element.
        addClass(value), removeClass(value), toggleClass(value): add, remove or toggle a value of the class attribute.
    jQuery builds in an automatic looping feature (Line ? to ?). For example, $('p') selects all <p> elements. $('p').append(...) applies the append(...) to each of the selected <p> element, in a implicit loop.
    You can also use an explicit loop via .each( function() {...} ) (Line ? to ?), if you need to apply more than one operations to the selected elements. Inside the .each(...), the $(this) denotes the element under operation.
    You can also use function chaining to chain the functions (Line ? to ?), as most of the functions return the element under operation.
    In many methods (such as html()), jQuery uses the same method name for both getter and setter, differentiated by its argument. For example html() (without argument) returns the innerHTML, while html(value) replaces the innerHTML. [It does not use Java's convention of getHtml() and setHtml().]
    The $(document).ready(function() {...}) runs the functions after the ROM tree is constructed, but does not wait for all the external resources (such as images) to be loaded (as in the JavaScript load event). Document ready is commonly used in jQuery, which provides a shorthand written as $(function() {...}).
