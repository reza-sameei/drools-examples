
### Config a kie-base to a specific package!
If you don't confine it, it'll traverse all jars to find rule/template/data files!
If it finds a csv/excel file with a template config, it'll try to load it as a decision table.

### When you encounter error related to not finding your kie-base!
- Obviously Check your kieBase that you have defined and the one that you have used in your code.
- Check your `kmodule.xml` syntax! If your file contains xml-syntax-errors, Drools is not going to
inform you with a relevant message.

### Don't use `default methods` in interfaces which you are going to use them inside rules!
This will cause Drools to function weirdly and show you unreasonable and irrelevant rule-compile-time error logs.

### Drools feature will be enabled if you have required deps in your classpath! 
For example if you are going to use Drools-template, you should add it to your dependencies! If not, Drools will not
show any relevant error log.

### In templaes csv files:
- Don't use quotations, because it'll use the value with qoutations inside your template.
- Don't put spaces :'a, b' N, 'a,b' Y
The CSV parser is so dum.

# When you encounter errors like this
java.lang.NullPointerException
	at org.drools.decisiontable.parser.DefaultRuleSheetListener.flushRule...
this means that your dtable file (data for template) is not reachable; check your configured path.
