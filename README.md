# pastspec

Work at formalising the spec for [past](https://github.com/paragonie/past).

Please refer to past.bnf.

## Usage

Test an arbitrary token like this:

    $ lein run token

Run the test suite with:

    $ lein test

## Example

```
$ lein run "v1."
Parse error at line 1, column 4:
v1.
   ^
Expected one of:
sign
enc
auth

$ lein run "v2.auth.eyJkYXRhIjoidGhpcyBpcyBhIHNpZ25lZCBtZXNzYWdlIiwiZXhwIjoiMjAzOS0wMS0wMVQwMDowMDowM"
[:PAST [:V2 v2 [:SEP .] [:purpose auth] [:SEP .] [:payload [:b64urlsafe e] [:b64urlsafe y] [:b64urlsafe J] [:b64urlsafe k] [:b64urlsafe Y]
...
```

## Notes

For most users, there is more value in reading the documents and code than running it.


## License


Copyright © 2018 

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
