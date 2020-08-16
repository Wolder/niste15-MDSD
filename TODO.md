## MDSD Project TODO


# Timeline:
Sunday      - Answer TODO. Start on DSL (Make dependency diagram. Read Emil's Report / Look at his project)
Monday      - Do the xtext and generation part (Start writing report)
Tuesday     - Finish xtext and generation and report
Wednesday   - Read report and fix todos


# TODO
- Describe what is it that we do?
    - Describe the project. What will be needed?
    - What will we do for varification and scoping?
- Map out DSL structure
- Do a quick mock-up of DSL
- Do some introduction generation  
- Make a small part of the validation
- Make a small part of the scoping
- Iterate this process. Adding more to the DSL, validation and scoping. 
- Document the process as features are added to the DSL.
- Git setup



# Features:
Application
- 1..* Panes (Name)
    - Frame
        - Widgets (Button, Radio, Progressbar, Image, Text etc. see ulriks example)
        - Frame
- Navigation Bar buttom
    - Button
        - Link to Pane (OnClick)
- Navigation Bar top
    - Button
        - Link to Pane (OnClick)


Application TestApp
    Pane MainPane {
        Frame{ Button("Hello!"), Text("Hello World", Text("Hello Again!")), constraintsHorizontal=top}
        Frame{ Text("This is another frame") , constraintsHorizontal=60%}
        Frame{ Text("This is another frame") , constraintsHorizontal=middle%}
    }
    Pane OtherPane {
        Frame TopFrame{ Text("This is another pane!")) , constraintsHorizontal=top}
        Frame{ Text("This is another pane!")) , constraintsHorizontal:bottomOf=TopFrame}
    }
    NavigationBar:Top{ Button("", navigate -> MainPane), Button("", navigate -> OtherPane)}
    